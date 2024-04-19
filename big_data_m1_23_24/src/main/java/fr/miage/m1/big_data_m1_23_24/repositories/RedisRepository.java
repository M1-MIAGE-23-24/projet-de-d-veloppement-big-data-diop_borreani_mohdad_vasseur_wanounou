package fr.miage.m1.big_data_m1_23_24.repositories;

import fr.miage.m1.big_data_m1_23_24.services.RandonneService;
import org.springframework.data.repository.CrudRepository;

public interface RedisRepository extends CrudRepository<RandonneService, Long> {

}
