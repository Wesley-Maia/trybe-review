package com.trybe.springTDD.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

//import org.junit.internal.matchers.StringContains.containsString;

@SpringBootTest
@AutoConfigureMockMvc
class EstudanteControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void devEstudanteTestOk() throws Exception {
		mockMvc.perform(get("/estudantes")).andExpect(status().isOk());
	}

	@Test
	void devEstudanteTestBody() throws Exception {
		final var resposta = mockMvc.perform(get("/estudantes"));

		resposta.andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk());
	}

	@Test
	public void devEstudanteTestBodyArray() throws Exception {
		this.mockMvc.perform(get("/estudantes")) // teste para acessar o endpoint
				.andDo(MockMvcResultHandlers.print()) // print do resultado do teste
				.andExpect(MockMvcResultMatchers.jsonPath("$").isArray()); // verificando se o endpoint retorna um array
	}

}
