package com.example.demo.bll;

import com.example.demo.dal.models.Javanais;
import com.example.demo.dal.repositories.JavanaisRepository;
import com.example.demo.pl.models.JavanaisForm;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JavanaisServiceImpl implements JavanaisService{
    
    private final JavanaisRepository javanaisRepository;

    public JavanaisServiceImpl(JavanaisRepository javanaisRepository) {
        this.javanaisRepository = javanaisRepository;
    }
    
    @Override
    public List<Javanais> getAll() {
        return javanaisRepository.findAll();
    }

    @Override
    public void create(JavanaisForm form) {
        if (form==null)
            throw new IllegalArgumentException("Form peut pas être null");
        
        Javanais javanais = new Javanais();
        javanais.setNom(form.getNom());
        javanais.setAge(form.getAge());
        javanaisRepository.save(javanais);
    }
}
