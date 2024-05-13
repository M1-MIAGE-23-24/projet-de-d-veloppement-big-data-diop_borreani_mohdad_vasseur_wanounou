package fr.miage.m1.big_data_m1_23_24.repositories.mongo;

import fr.miage.m1.big_data_m1_23_24.entity.Avis;
import fr.miage.m1.big_data_m1_23_24.entity.AvisSearchCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.ArrayList;
import java.util.List;

public class AvisMongoDBRepositoryImpl implements AvisMongoDBRepositoryCustom {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<Avis> searchAvis(AvisSearchCriteria criteria) {
        List<Criteria> criteriaList = new ArrayList<>();

        if (criteria.getAv_id() != null) {
            criteriaList.add(Criteria.where("av_id").is(criteria.getAv_id()));
        }

        if (criteria.getAv_etoile() != null) {
            criteriaList.add(Criteria.where("av_etoile").is(criteria.getAv_etoile()));
        }

        if (criteria.getAv_message() != null && !criteria.getAv_message().isEmpty()) {
            criteriaList.add(Criteria.where("av_message").regex(criteria.getAv_message(), "i"));
        }

        if (criteria.getRandonne_uuid() != null) {
            criteriaList.add(Criteria.where("randonne.uuid").is(criteria.getRandonne_uuid()));
        }

        Query query = new Query();
        if (!criteriaList.isEmpty()) {
            query.addCriteria(new Criteria().andOperator(criteriaList.toArray(new Criteria[0])));
        }

        return mongoTemplate.find(query, Avis.class);
    }

}
