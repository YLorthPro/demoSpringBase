package com.example.demo.dal.repositories;

import com.example.demo.dal.models.Javanais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JavanaisRepository extends JpaRepository<Javanais,Long> {
    
}
