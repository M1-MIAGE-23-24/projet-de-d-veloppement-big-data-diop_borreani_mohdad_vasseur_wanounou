package fr.miage.m1.big_data_m1_23_24.services;

import fr.miage.m1.big_data_m1_23_24.entity.Randonne;

import java.util.List;

public interface RandonneService {

    public Randonne get(Long id);

    public List<Randonne> getAll();

    public Randonne create(Randonne author);

    public Randonne edit(Randonne author);

    public void delete(Long id);
}
