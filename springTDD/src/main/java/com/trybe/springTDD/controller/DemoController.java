package com.trybe.springTDD.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping
	public Map<String, String> regioes(){
		return Map.of("estado", "Pernambuco", "cidade", "Recife");
	}

}
