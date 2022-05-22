package com.br.pedeai.autenticacao.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
	
	@Value("${autenticacao.remetente}")
	private String remetente;

	@Autowired
	private JavaMailSender enviaEmail;
	
	public void sendEmail(String numero, String destinatario) {

        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo(destinatario);

        msg.setSubject("Código de Verificação PedeAi");
        msg.setText("Olá, o seu código de verificação é: " + numero);

        enviaEmail.send(msg);

    }
}
