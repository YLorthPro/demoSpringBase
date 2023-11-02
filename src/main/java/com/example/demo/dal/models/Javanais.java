package com.example.demo.dal.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "personne")
@Data
public class Javanais {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "javanais_id")
    private Long id;
    
    @Column(nullable = false, unique = true)
    String nom;
    
    int age;
}
