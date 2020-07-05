package com.desafio.ambev.api.dto;



import javax.validation.constraints.NotNull;

import com.desafio.ambev.domain.entity.Endereco;
import com.desafio.ambev.domain.entity.Proprietario;

public class EstabelecimentoUpdateDTO {

	private Long id;
	
	@NotNull
	private String nome;
	
	private String qtdBanheiros;
	
	@NotNull
	private Proprietario proprietario;
	
	@NotNull
	private Endereco endereco;
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public Proprietario getProprietario() {
		return proprietario;
	}
	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}
	
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
