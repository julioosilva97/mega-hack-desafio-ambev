package com.desafio.ambev.api.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import com.desafio.ambev.domain.entity.Estabelecimento;

public class CardapioDTO {

	private Long id;
	
	private Long idEstebelecimento; 
	
	@NotNull
	private List<ProdutoDTO> produtos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<ProdutoDTO> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<ProdutoDTO> produtos) {
		this.produtos = produtos;
	}

	public Long getIdEstebelecimento() {
		return idEstebelecimento;
	}

	public void setIdEstebelecimento(Long idEstebelecimento) {
		this.idEstebelecimento = idEstebelecimento;
	}
	
}
