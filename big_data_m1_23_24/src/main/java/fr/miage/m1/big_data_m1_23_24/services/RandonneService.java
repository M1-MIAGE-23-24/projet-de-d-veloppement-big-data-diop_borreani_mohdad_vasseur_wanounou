package fr.miage.m1.big_data_m1_23_24.services;

import fr.miage.m1.big_data_m1_23_24.entity.randonne;

import java.util.List;

public interface RandonneService {

    public randonne get(Long id);

    public List<randonne> getAll();

    public randonne create(randonne author);

    public randonne edit(randonne author);

    public void delete(Long id);
}
