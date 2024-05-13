package fr.miage.m1.big_data_m1_23_24.repositories.mongo;

import fr.miage.m1.big_data_m1_23_24.entity.Avis;
import fr.miage.m1.big_data_m1_23_24.entity.AvisSearchCriteria;

import java.util.List;

public interface AvisMongoDBRepositoryCustom {

    List<Avis> searchAvis(AvisSearchCriteria criteria);

}
