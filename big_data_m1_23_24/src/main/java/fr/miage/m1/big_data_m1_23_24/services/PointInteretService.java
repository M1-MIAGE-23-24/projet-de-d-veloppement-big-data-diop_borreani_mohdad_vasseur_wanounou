package fr.miage.m1.big_data_m1_23_24.services;



import fr.miage.m1.big_data_m1_23_24.entity.PointInteret;

import java.util.List;

public interface PointInteretService {

    public PointInteret get(int id);

    public List<PointInteret> getAll();

    public PointInteret create(PointInteret pointInteret);

    public PointInteret edit(PointInteret pointInteret);

    public void delete(int id);

    //List<PointInteret> searchByDescription(String description);

    //List<PointInteret> searchByPhotoLink(String photoLink);

}
