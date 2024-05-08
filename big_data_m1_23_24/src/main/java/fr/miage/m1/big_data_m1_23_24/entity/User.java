package fr.miage.m1.big_data_m1_23_24.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Entity
@Setter @Getter @NoArgsConstructor @AllArgsConstructor @Builder // Lombok
@Table(name = "user")
@Document(collation = "user") // Mongo
public class User {
    @Id

    @org.springframework.data.annotation.Id // MongoDB primary key
    private UUID uuid;

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String firstname;

    private String lastname;
}
