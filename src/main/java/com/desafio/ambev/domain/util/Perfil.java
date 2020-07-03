package com.desafio.ambev.domain.util;

public enum Perfil {
	
	CLIENTE("CLIENTE"),
	DONO("DONE"),
	ADMINISTRATOR("ADMINISTRATOR");
	
	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	private Perfil(String descricao) {
		this.descricao = descricao;
	}
	
}
