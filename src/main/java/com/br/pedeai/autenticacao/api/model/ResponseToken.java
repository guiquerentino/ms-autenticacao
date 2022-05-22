package com.br.pedeai.autenticacao.api.model;

public class ResponseToken {
	
	private String tokenCode;

	public String getTokenCode() {
		return tokenCode;
	}

	public void setTokenCode(String tokenCode) {
		this.tokenCode = tokenCode;
	}

	public ResponseToken(String tokenCode) {
		super();
		this.tokenCode = tokenCode;
	}

	public ResponseToken() {
		super();
	}
	
	
	

}
