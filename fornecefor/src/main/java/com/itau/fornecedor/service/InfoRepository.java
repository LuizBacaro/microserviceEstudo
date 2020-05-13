package com.itau.fornecedor.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.itau.fornecedor.model.InfoFornecedor;

@Repository
public interface InfoRepository extends CrudRepository<InfoFornecedor, Long>{

	InfoFornecedor findByEstado(String estado);
}
