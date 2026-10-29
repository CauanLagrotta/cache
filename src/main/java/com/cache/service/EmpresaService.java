package com.cache.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cache.entity.Empresa;
import com.cache.repository.EmpresaRepository;

@Service 
public class EmpresaService {

    @Autowired 
    private EmpresaRepository empresaRepository;

    public List<Empresa> findAll(){
        return (List<Empresa>) empresaRepository.findAll();
    }
}
