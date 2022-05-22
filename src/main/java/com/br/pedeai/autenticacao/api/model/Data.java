package com.br.pedeai.autenticacao.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class Data {

	@JsonProperty(value = "destinatario")
	private String destinatarioNome;

	public String getDestinatarioNome() {
		return destinatarioNome;
	}

	public void setDestinatarioNome(String destinatarioNome) {
		this.destinatarioNome = destinatarioNome;
	}

	public Data(String destinatarioNome) {
		super();
		this.destinatarioNome = destinatarioNome;
	}

	public Data() {
		super();
	}
	
	
	
	
}
