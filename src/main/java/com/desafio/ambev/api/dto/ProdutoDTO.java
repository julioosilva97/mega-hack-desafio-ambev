package com.desafio.ambev.api.dto;

import javax.validation.constraints.NotBlank;

public class ProdutoDTO {
	
	private Long id;
	
	private String nome;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ProdutoDTO(Long id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public ProdutoDTO() {
	}
	
	

}
