package fr.miage.m1.big_data_m1_23_24.services.mongo;

import fr.miage.m1.big_data_m1_23_24.entity.PointInteret;
import fr.miage.m1.big_data_m1_23_24.repositories.mongo.PointInteretMongoDBRepository;
import fr.miage.m1.big_data_m1_23_24.services.PointInteretService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PointInteretMongoDBService implements PointInteretService {

    @Autowired
    private PointInteretMongoDBRepository pointInteretMongoDBRepository;

    @Override
    public PointInteret get(int id) {
        return pointInteretMongoDBRepository.findByPoId(id).orElse(null);
    }

    @Override
    public List<PointInteret> getAll() {
        return pointInteretMongoDBRepository.findAll();
    }

    @Override
    public PointInteret create(PointInteret pointInteret) {
        return pointInteretMongoDBRepository.save(pointInteret);
    }

    @Override
    public PointInteret edit(PointInteret pointInteret) {
        return pointInteretMongoDBRepository.save(pointInteret);
    }

    @Override
    public void delete(int id) {
        pointInteretMongoDBRepository.deleteByPoId(id);
    }

    /*@Override
    public List<PointInteret> searchByDescription(String description) {
        return pointInteretMongoDBRepository.findByPo_DescriptionContaining(description);
    }*/

    /*@Override
    public List<PointInteret> searchByPhotoLink(String photoLink) {
        return pointInteretMongoDBRepository.findByPoLienPhotoContaining(photoLink);
    }*/

}
