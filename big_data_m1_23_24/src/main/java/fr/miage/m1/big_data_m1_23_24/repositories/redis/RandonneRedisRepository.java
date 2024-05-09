package fr.miage.m1.big_data_m1_23_24.repositories.redis;

import fr.miage.m1.big_data_m1_23_24.entity.Randonne;
import fr.miage.m1.big_data_m1_23_24.repositories.RandonneRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface RandonneRedisRepository extends CrudRepository<Randonne, UUID>, RandonneRepository {
}
