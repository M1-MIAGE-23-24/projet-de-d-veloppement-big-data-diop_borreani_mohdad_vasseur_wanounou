package fr.miage.m1.big_data_m1_23_24.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Entity // JPA
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder // Lombok
@Table(name = "randonne")
@Document(collation = "randonne") //Mongo
public class Randonne {

    @Id
    @org.springframework.data.annotation.Id // MongoDB primary key
    private UUID uuid;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ra_id;

    private String ra_label;

    @Embedded
    private GPS ra_gpx;

    private String ra_description;

    private int ra_duree;

    private String ra_difficulte;

    private int ra_denivele;

    private double ra_distance;

    private boolean ra_boucle;

    private int po_id;

    private int av_id;
}

