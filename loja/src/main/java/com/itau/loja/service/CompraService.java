package com.itau.loja.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.itau.loja.controller.dto.CompraDTO;
import com.itau.loja.controller.dto.InfoFornecedorDTO;

public class CompraService {

	@Autowired
	private RestTemplate client;

	public void realizaCompra(CompraDTO compra) {
		
		ResponseEntity<InfoFornecedorDTO> exchange = 
			client.exchange("http://fornecedor/info/"+compra.getEndereco().getEstado(),
			HttpMethod.GET, null, InfoFornecedorDTO.class);
		
		System.out.println(exchange.getBody().getEndereco());
		
	}
}
