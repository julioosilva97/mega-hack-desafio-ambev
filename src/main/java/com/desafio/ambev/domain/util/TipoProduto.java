package com.desafio.ambev.domain.util;

public enum TipoProduto {
	
	ALIMENTO("ALIMENTO"),
	BEBIDA("BEBIDA");
	
	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	private TipoProduto(String descricao) {
		this.descricao = descricao;
	}
	
}
