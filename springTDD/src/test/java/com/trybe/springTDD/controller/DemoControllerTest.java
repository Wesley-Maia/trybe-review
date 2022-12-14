package com.trybe.springTDD.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class DemoControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void devDemoTestOk() throws Exception {
		mockMvc
		.perform(get("/"))
		.andExpect(status().isOk());
	}
	
	@Test
	void devDemoTestBody() throws Exception {
		mockMvc
		.perform(get("/"))
		.andExpect(jsonPath("$.cidade").value("Recife"))
		.andExpect(jsonPath("$.estado").value("Pernambuco"));
	}

}
