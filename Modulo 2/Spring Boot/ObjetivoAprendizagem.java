package com.helloworld.hello.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Objetivo de Aprendizagem")
public class ObjetivoAprendizagem {
	
	@GetMapping
	public String Objetivo() {
		return "Aprender o conteúdo de Spring Boot e avançar no Projeto Integrador.";
	}

}
