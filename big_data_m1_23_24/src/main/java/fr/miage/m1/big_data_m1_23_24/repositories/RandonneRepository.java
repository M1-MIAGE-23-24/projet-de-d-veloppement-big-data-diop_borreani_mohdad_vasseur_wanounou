package fr.miage.m1.big_data_m1_23_24.repositories;


import fr.miage.m1.big_data_m1_23_24.entity.Randonne;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RandonneRepository {

    public List<Randonne> findAll();

    /*List<Randonne> findByRaLabelContaining(String label);

    List<Randonne> findByRaDifficulte(String difficulty);*/

    //Randonne saveRandonne(Randonne randonne);

    void deleteById(int ra_id);

    //Optional<Randonne> findByRaId(int raId);
    //Optional<Randonne> findByRa_id(int ra_id);
}
