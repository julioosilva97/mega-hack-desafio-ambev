package com.desafio.ambev.api.dto;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.desafio.ambev.domain.entity.Estabelecimento;
import com.desafio.ambev.domain.entity.Produto;

public class PromocoesDTO {

	private Long id;
	
	@NotNull
	private String descricao;
	
	@NotNull
	private Estabelecimento estabelecimento;
	

	private List<Produto> produtos;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Estabelecimento getEstabelecimento() {
		return estabelecimento;
	}
	public void setEstabelecimento(Estabelecimento estabelecimento) {
		this.estabelecimento = estabelecimento;
	}
	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	
}
