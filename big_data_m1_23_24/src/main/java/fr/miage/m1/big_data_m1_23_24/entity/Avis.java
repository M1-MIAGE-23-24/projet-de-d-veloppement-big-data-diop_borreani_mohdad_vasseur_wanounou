package fr.miage.m1.big_data_m1_23_24.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity // JPA
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder // Lombok
@Table(name = "Avis") // JPA
public class Avis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int av_id;

    @Enumerated(EnumType.STRING)
    private Rating av_etoile;

    private String av_message;

    @ManyToOne
    @JoinColumn(name = "ra_id")
    private randonne randonne;
}

enum Rating {
    ZERO, ONE, TWO, THREE, FOUR, FIVE
}