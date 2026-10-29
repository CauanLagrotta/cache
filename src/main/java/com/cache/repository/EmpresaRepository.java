package com.cache.repository;

import org.springframework.data.repository.CrudRepository;

import com.cache.entity.Empresa;

public interface EmpresaRepository extends CrudRepository<Empresa, Long> {

}
