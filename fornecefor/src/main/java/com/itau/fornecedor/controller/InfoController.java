package com.itau.fornecedor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itau.fornecedor.model.InfoFornecedor;
import com.itau.fornecedor.service.InfoService;

public class InfoController {

	@Autowired
	private InfoService infoService;

	@RequestMapping("/{estado}")
	public InfoFornecedor getInfoPorEstado(@PathVariable String estado) {
		return infoService.getInfoPorEstado(estado);
	}
}
