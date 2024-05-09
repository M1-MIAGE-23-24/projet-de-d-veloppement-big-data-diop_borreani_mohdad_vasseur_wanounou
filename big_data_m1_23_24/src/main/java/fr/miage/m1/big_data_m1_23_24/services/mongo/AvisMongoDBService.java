package fr.miage.m1.big_data_m1_23_24.services.mongo;

import fr.miage.m1.big_data_m1_23_24.entity.Avis;
import fr.miage.m1.big_data_m1_23_24.repositories.mongo.AvisMongoDBRepository;
import fr.miage.m1.big_data_m1_23_24.services.AvisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvisMongoDBService implements AvisService {

    @Autowired
    private AvisMongoDBRepository avisMongoDBRepository;

    @Override
    public Avis get(int id) {
        return avisMongoDBRepository.findByAvId(id).orElse(null);
    }

    @Override
    public List<Avis> getAll() {
        return avisMongoDBRepository.findAll();
    }

    @Override
    public Avis create(Avis avis) {
        return avisMongoDBRepository.save(avis);
    }

    @Override
    public Avis edit(Avis avis) {
        return avisMongoDBRepository.save(avis);
    }

    @Override
    public void delete(int id) {
        avisMongoDBRepository.deleteByAvId(id);
    }

    /*@Override
    public List<Avis> searchByMessage(String message) {
        return avisMongoDBRepository.findByAvMessageContaining(message);
    }*/
}
