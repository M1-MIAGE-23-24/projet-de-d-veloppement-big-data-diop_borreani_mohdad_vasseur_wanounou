package fr.miage.m1.big_data_m1_23_24.entity;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder // Lombok
@Document(collation = "avis") // Mongo
public class Avis {

    @Id
    private UUID uuid;

    private int av_id;

    @Enumerated(EnumType.STRING)
    private Rating av_etoile;

    private String av_message;

    @ManyToOne
    @JoinColumn(name = "ra_id")
    private Randonne randonne;
}

enum Rating {
    ZERO, ONE, TWO, THREE, FOUR, FIVE
}