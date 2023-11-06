package com.cibertec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.entity.Pais;
import com.cibertec.service.PaisService;

@RestController
@RequestMapping("/rest/pais")
public class PaisController {

	@Autowired
	private PaisService service;
	
	@ResponseBody
	@GetMapping("/listaPais")
	public List<Pais> lista(){
		List<Pais> lstSalida =  service.listaTodos();
		return lstSalida;
	}
}
