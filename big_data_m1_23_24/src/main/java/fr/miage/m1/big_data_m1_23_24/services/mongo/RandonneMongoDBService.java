package fr.miage.m1.big_data_m1_23_24.services.mongo;

import fr.miage.m1.big_data_m1_23_24.entity.Randonne;
import fr.miage.m1.big_data_m1_23_24.repositories.mongo.RandonneMongoDBRepository;
import fr.miage.m1.big_data_m1_23_24.services.RandonneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class RandonneMongoDBService implements RandonneService {

    @Autowired
    private RandonneMongoDBRepository randonneMongoDBRepository;

    @Override
    public Optional<Randonne> get(UUID uuid) {
        return randonneMongoDBRepository.findById(uuid);
    }


    @Override
    public List<Randonne> getAll() {
        return randonneMongoDBRepository.findAll();
    }

    @Override
    public Randonne create(Randonne randonne) {
        return randonneMongoDBRepository.save(randonne);
    }

    @Override
    public Randonne edit(Randonne randonne) {
        return randonneMongoDBRepository.save(randonne);
    }

    @Override
    public void delete(int ra_id) {
        randonneMongoDBRepository.deleteById(ra_id);
    }

    /*@Override
    public List<Randonne> searchByLabel(String label) {
        return randonneMongoDBRepository.findByRaLabelContaining(label);
    }

    @Override
    public List<Randonne> searchByDifficulty(String difficulty) {
        return randonneMongoDBRepository.findByRaDifficulte(difficulty);
    }*/
}
