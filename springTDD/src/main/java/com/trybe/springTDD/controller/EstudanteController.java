package com.trybe.springTDD.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trybe.springTDD.model.Estudante;
import com.trybe.springTDD.service.EstudanteService;

@RestController
public class EstudanteController {
	
	@Autowired
	EstudanteService estudanteService;
	
	@GetMapping("/estudantes")
	public List<Estudante> listarEstudantes(){
		List<Estudante> estudantes = estudanteService.listarEstudantes();
		
		return estudantes;
	}

}
