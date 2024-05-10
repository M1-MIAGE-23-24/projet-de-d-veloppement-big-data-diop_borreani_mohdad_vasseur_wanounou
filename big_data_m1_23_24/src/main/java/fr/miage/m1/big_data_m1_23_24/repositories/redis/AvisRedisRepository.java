package fr.miage.m1.big_data_m1_23_24.repositories.redis;

import fr.miage.m1.big_data_m1_23_24.entity.Avis;
import fr.miage.m1.big_data_m1_23_24.repositories.AvisRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface AvisRedisRepository extends CrudRepository<Avis, UUID>, AvisRepository {
}
