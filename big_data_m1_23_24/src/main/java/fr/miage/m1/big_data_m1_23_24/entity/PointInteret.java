package fr.miage.m1.big_data_m1_23_24.entity;

import jakarta.persistence.*;
import lombok.*;
@Entity // JPA
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder // Lombok
@Table(name = "PointInteret") // JPA
public class PointInteret {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int po_id;

    @Embedded
    private GPS po_gps;

    private String po_description;

    private String po_lien_photo;

    @ManyToOne
    @JoinColumn(name = "ra_id")
    private randonne randonne;
}

