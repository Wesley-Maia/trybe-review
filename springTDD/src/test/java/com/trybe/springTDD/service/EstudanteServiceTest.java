package com.trybe.springTDD.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import com.trybe.springTDD.model.Estudante;

@SpringBootTest
@AutoConfigureMockMvc
class EstudanteServiceTest {
	
	@Autowired
	private EstudanteService estudanteService;

	@Test
	void devEstudanteServiceTest() {
		List<Estudante> list = estudanteService.listarEstudantes();
		assertEquals(3, list.size());
	}

}
