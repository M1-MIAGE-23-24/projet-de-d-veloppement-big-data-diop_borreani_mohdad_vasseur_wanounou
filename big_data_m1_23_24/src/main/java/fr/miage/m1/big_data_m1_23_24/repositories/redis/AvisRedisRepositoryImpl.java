package fr.miage.m1.big_data_m1_23_24.repositories.redis;

import fr.miage.m1.big_data_m1_23_24.entity.Avis;
import fr.miage.m1.big_data_m1_23_24.entity.AvisSearchCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Repository
public class AvisRedisRepositoryImpl implements AvisRedisRepositoryCustom {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Override
    public List<Avis> searchAvis(AvisSearchCriteria criteria) {
        try {
            Set<String> keys = redisTemplate.keys("*");
            List<Avis> results = new ArrayList<>();

            for (String key : keys) {
                Avis avis = (Avis) redisTemplate.opsForValue().get(key);

                if (avis != null) {
                    boolean matches = true;

                    if (criteria.getAv_id() != null && !criteria.getAv_id().equals(avis.getAv_id())) {
                        matches = false;
                    }

                    if (criteria.getAv_etoile() != null && !criteria.getAv_etoile().equals(avis.getAv_etoile())) {
                        matches = false;
                    }

                    if (criteria.getAv_message() != null && !criteria.getAv_message().isEmpty() &&
                            !avis.getAv_message().toLowerCase().contains(criteria.getAv_message().toLowerCase())) {
                        matches = false;
                    }

                    if (criteria.getRandonne_uuid() != null && !criteria.getRandonne_uuid().equals(UUID.fromString(avis.getRandonne_uuid()))) {
                        matches = false;
                    }

                    if (matches) {
                        results.add(avis);
                    }
                }
            }

            return results;
        } catch (Exception e) {
            throw new RuntimeException("Error in execution", e);
        }
    }
}
