package com.example.demo.pl.models;

import com.example.demo.dal.models.Javanais;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class JavanaisDTO {
    private String nom;
    private int age;
    
    
    public static JavanaisDTO fromEntity(Javanais entity){
        return JavanaisDTO.builder()
                .nom(entity.getNom())
                .age(entity.getAge())
                .build();
    }
}
