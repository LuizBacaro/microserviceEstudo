package com.itau.loja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.itau.loja.controller.dto.CompraDTO;
import com.itau.loja.service.CompraService;

@RestController
@RequestMapping("/compra")
public class LojaController {
	
	@Autowired
	private CompraService compraService;
	
	@RequestMapping(method = RequestMethod.POST)
	public void realizaCompra(@RequestBody CompraDTO compra) {
		compraService.realizaCompra(compra);
	}

}
