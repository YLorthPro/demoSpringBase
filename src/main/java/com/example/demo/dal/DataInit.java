package com.example.demo.dal;

import com.example.demo.dal.models.Javanais;
import com.example.demo.dal.repositories.JavanaisRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class DataInit implements InitializingBean {
    
    private final JavanaisRepository javanaisRepository;

    public DataInit(JavanaisRepository javanaisRepository) {
        this.javanaisRepository = javanaisRepository;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        Javanais test = new Javanais();
        test.setAge(32);
        test.setNom("jaja");
        javanaisRepository.save(test);

        Javanais test2 = new Javanais();
        test2.setAge(4);
        test2.setNom("jajajeje");
        javanaisRepository.save(test2);
    }
}
