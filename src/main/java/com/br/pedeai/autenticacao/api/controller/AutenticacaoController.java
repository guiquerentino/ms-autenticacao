package com.br.pedeai.autenticacao.api.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.pedeai.autenticacao.api.service.EmailService;

@RestController
@RequestMapping(path = "/api/login/")
public class AutenticacaoController {

	@Autowired
	private EmailService service;

	@PostMapping(path = "/autenticacao")
	public String enviaEmailAutenticacao(@RequestBody String destinatario) {

		Integer numero = 0;
		Random gerador = new Random();

		while (numero < 1000) {
			
			numero = gerador.nextInt(9999);
		}
		
		String numeroString = numero.toString();

		service.sendEmail(numeroString, destinatario);

		return numeroString;

	}

}
