package fr.miage.m1.big_data_m1_23_24.services;

import fr.miage.m1.big_data_m1_23_24.entity.Avis;

import java.util.List;

public interface AvisService {

    public Avis get(int id);

    public List<Avis> getAll();

    public Avis create(Avis avis);

    public Avis edit(Avis avis);

    public void delete(int id);

    ///List<Avis> searchByMessage(String av_message);

}
