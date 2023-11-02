package com.example.demo.pl.models;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class JavanaisForm {
    @NotBlank
    private String nom;
    @Positive
    private int age;
}
