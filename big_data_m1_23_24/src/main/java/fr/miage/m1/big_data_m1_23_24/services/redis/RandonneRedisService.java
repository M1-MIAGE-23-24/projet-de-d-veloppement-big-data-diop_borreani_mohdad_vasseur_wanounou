package fr.miage.m1.big_data_m1_23_24.services.redis;

import fr.miage.m1.big_data_m1_23_24.entity.Randonne;
import fr.miage.m1.big_data_m1_23_24.entity.RandonneSearchCriteria;
import fr.miage.m1.big_data_m1_23_24.repositories.redis.RandonneRedisRepository;
import fr.miage.m1.big_data_m1_23_24.services.RandonneService;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class RandonneRedisService implements RandonneService {

    private final RandonneRedisRepository randonneRedisRepository;

    public RandonneRedisService(RandonneRedisRepository randonneRedisRepository) {
        this.randonneRedisRepository = randonneRedisRepository;
    }

    @Override
    public List<Randonne> getAll() {
        return (List<Randonne>) randonneRedisRepository.findAll();
    }

    @Override
    public Optional<Randonne> get(UUID uuid) {
        return randonneRedisRepository.findById(uuid);
    }

    @Override
    public Randonne create(Randonne randonne) {
        return randonneRedisRepository.save(randonne);
    }

    @Override
    public Randonne edit(Randonne randonne) {
        return randonneRedisRepository.save(randonne);
    }

    @Override
    public void delete(UUID uuid) {
        randonneRedisRepository.deleteById(uuid);
    }

    @Override
    public List<Randonne> search(RandonneSearchCriteria criteria) {
        return randonneRedisRepository.searchRandonneRedis(criteria);
    }


}
