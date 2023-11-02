package com.example.demo.bll;

import com.example.demo.dal.models.Javanais;
import com.example.demo.pl.models.JavanaisForm;

import java.util.List;

public interface JavanaisService {
    List<Javanais> getAll();
    void create(JavanaisForm form);
}
