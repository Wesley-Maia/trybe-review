package com.trybe.springTDD.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.trybe.springTDD.model.Estudante;

@Service
public class EstudanteService {
	
	public List<Estudante> listarEstudantes() {
		List<Estudante> list = new ArrayList<>();
		
		Estudante est1 = new Estudante();
		Estudante est2 = new Estudante();
		Estudante est3 = new Estudante();
		
		est1.setMatricula(1);
		est1.setNome("Tony");
		
		est2.setMatricula(2);
		est2.setNome("Ana");
		
		est3.setMatricula(3);
		est3.setNome("Gabis");
		
		list.add(est1);
		list.add(est2);
		list.add(est3);

		return list;
	}

}
