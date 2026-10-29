package com.cache.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cache.entity.Empresa;
import com.cache.service.EmpresaService;

@RestController 
@RequestMapping("/empresa")
public class EmpresaController {

    @Autowired 
    private EmpresaService empresaService;

    @GetMapping 
    public ResponseEntity<List<Empresa>> findAll(){
        return ResponseEntity.ok(empresaService.findAll());
    }
}
