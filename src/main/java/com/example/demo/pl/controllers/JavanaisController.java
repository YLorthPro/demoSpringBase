package com.example.demo.pl.controllers;

import com.example.demo.bll.JavanaisService;
import com.example.demo.pl.models.JavanaisDTO;
import com.example.demo.pl.models.JavanaisForm;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/demo")
public class JavanaisController {
    private final JavanaisService javanaisService;

    public JavanaisController(JavanaisService javanaisService) {
        this.javanaisService = javanaisService;
    }
    
    @GetMapping("/all")
    public ResponseEntity<List<JavanaisDTO>> getAll(){
        return ResponseEntity.ok(javanaisService.getAll().stream().map(JavanaisDTO::fromEntity).toList());
    }
    
    @PostMapping("/add")
    public void create(@RequestBody @Valid JavanaisForm form){
        javanaisService.create(form);
    }
}
