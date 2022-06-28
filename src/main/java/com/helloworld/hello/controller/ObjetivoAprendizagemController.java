package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/objetivo")
public class ObjetivoAprendizagemController {

	@GetMapping
	  public String objetivo() {
		return "Objetivo de apreendizagem:\n"
				+ "O meu objetivo é exercitar a counicacão \n"
				+ "Melhorar os meus termos tecnicos de Java";
					
	}

}