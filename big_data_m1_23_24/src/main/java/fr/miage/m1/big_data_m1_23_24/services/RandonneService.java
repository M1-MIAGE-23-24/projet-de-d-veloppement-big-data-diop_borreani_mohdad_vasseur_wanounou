package fr.miage.m1.big_data_m1_23_24.services;

import fr.miage.m1.big_data_m1_23_24.entity.Randonne;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface RandonneService {

    //public Randonne get(int ra_id);

    public List<Randonne> getAll();

    public Randonne create(Randonne author);

    public Randonne edit(Randonne author);

    public void delete(int ra_id);

    Optional<Randonne> get(UUID uuid);

    //List<Randonne> searchByLabel(String label);

    //List<Randonne> searchByDifficulty(String difficulty);
}
