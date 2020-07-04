package com.desafio.ambev.api.dto;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.desafio.ambev.domain.entity.Cardapio;
import com.desafio.ambev.domain.entity.Endereco;
import com.desafio.ambev.domain.entity.Evento;
import com.desafio.ambev.domain.entity.Pessoa;
import com.desafio.ambev.domain.entity.Proprietario;

public class EstabelecimentoDTO {

	private Long id;
	
	@NotNull
	private String nome;
	
	@NotNull
	private Endereco endereco;
	
	private String qtdBanheiros;
	
	@NotNull
	private Proprietario proprietario;
	
	private Cardapio cardapio;
	private List<Evento> eventos;
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
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getQtdBanheiros() {
		return qtdBanheiros;
	}
	public void setQtdBanheiros(String qtdBanheiros) {
		this.qtdBanheiros = qtdBanheiros;
	}
	public Proprietario getProprietario() {
		return proprietario;
	}
	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}
	public Cardapio getCardapio() {
		return cardapio;
	}
	public void setCardapio(Cardapio cardapio) {
		this.cardapio = cardapio;
	}
	public List<Evento> getEventos() {
		return eventos;
	}
	public void setEventos(List<Evento> eventos) {
		this.eventos = eventos;
	}
	
	
}
