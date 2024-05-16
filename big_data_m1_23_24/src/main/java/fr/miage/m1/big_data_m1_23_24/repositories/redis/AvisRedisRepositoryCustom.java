package fr.miage.m1.big_data_m1_23_24.repositories.redis;

import fr.miage.m1.big_data_m1_23_24.entity.Avis;
import fr.miage.m1.big_data_m1_23_24.entity.AvisSearchCriteria;

import java.util.List;

public interface AvisRedisRepositoryCustom {

    List<Avis> searchAvis(AvisSearchCriteria criteria);
}
