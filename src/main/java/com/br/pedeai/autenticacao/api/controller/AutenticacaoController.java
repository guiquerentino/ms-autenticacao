package com.br.pedeai.autenticacao.api.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.pedeai.autenticacao.api.model.Data;
import com.br.pedeai.autenticacao.api.model.ResponseToken;
import com.br.pedeai.autenticacao.api.service.EmailService;

@RestController
@RequestMapping(path = "/api/login/")
public class AutenticacaoController {

	@Autowired
	private EmailService service;

	@PostMapping(path = "/autenticacao")
	public ResponseEntity<?> enviaEmailAutenticacao(@RequestBody Data data) {
		
		ResponseToken token = new ResponseToken();

		Integer numero = 0;
		Random gerador = new Random();

		while (numero < 1000) {
			numero = gerador.nextInt(9999);
		}
		
		String numeroString = numero.toString();
		
		
		token.setTokenCode(numeroString);
		

		service.sendEmail(numeroString, data.getDestinatarioNome());

		return new ResponseEntity<>(token,HttpStatus.OK);

	}

}
