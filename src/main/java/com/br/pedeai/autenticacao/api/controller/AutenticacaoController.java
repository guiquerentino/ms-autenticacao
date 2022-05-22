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
		
		System.out.println(destinatario);
		
		Random gerador = new Random();
		Integer numero = gerador.nextInt(9999);
		String numeroString = numero.toString();
		
		//service.enviaEmail(numeroString, destinatario);
		service.sendEmail(numeroString, destinatario);

		
		return numeroString;
		//Recebe requisição (GET) (OK)
		//Gera número aleatório (OK)
		//Envia e-mail com número aleatório (OK)
		
	}

}
