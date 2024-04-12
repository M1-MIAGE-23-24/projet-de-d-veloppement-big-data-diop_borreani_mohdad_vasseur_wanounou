package fr.miage.m1.big_data_m1_23_24.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity // JPA
@Setter @Getter @NoArgsConstructor @AllArgsConstructor @Builder // Lombok
@Table(name = "users") // JPA
public class User {
    @Id // JPA
    @GeneratedValue(strategy = GenerationType.IDENTITY) // JPA
    private Long id;

    private String firstname;

    private String lastname;
}
