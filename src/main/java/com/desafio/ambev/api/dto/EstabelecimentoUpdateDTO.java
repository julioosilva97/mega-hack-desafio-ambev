package com.desafio.ambev.api.dto;



import javax.validation.constraints.NotNull;

public class EstabelecimentoUpdateDTO {

	private Long id;
	
	@NotNull
	private String nome;
	
	private String qtdBanheiros;
	
	
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
	
	public String getQtdBanheiros() {
		return qtdBanheiros;
	}
	public void setQtdBanheiros(String qtdBanheiros) {
		this.qtdBanheiros = qtdBanheiros;
	}
	
	
}
