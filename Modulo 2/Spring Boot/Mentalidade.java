package com.helloworld.hello.control;


	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

	@RestController
	@RequestMapping("/Mentalidade")
	public class Mentalidade {
		
		@GetMapping
		public String mentalidade() {
			return "Mentalidade de crescimento e Proatividade!!";
		}

	}