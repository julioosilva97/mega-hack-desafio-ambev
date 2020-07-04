package com.desafio.ambev.domain.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.modelmapper.ModelMapper;

import com.desafio.ambev.api.dto.EstabelecimentoDTO;
import com.desafio.ambev.domain.util.AbstractEntity;

@SuppressWarnings("serial")
@Entity
@Table(name = "ESTABELECIMENTO")
public class Estabelecimento extends AbstractEntity<Long> {

	private String nome;
	@OneToOne
	@JoinColumn(name="id_endereco")
	private Endereco endereco;
	
	private int qtdBanheiros;
	
	@OneToOne
	@JoinColumn(name="id_dono")
	private Pessoa dono;
	
	@OneToOne
	@JoinColumn(name="id_cardapio")
	private Cardapio cardapio;
	
	@OneToMany(mappedBy ="evento")
	private List <Evento> eventos;

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

	public int getQtdBanheiros() {
		return qtdBanheiros;
	}

	public void setQtdBanheiros(int qtdBanheiros) {
		this.qtdBanheiros = qtdBanheiros;
	}

	public Pessoa getDono() {
		return dono;
	}

	public void setDono(Pessoa dono) {
		this.dono = dono;
	}

	public Cardapio getCardapio() {
		return cardapio;
	}

	public void setCardapio(Cardapio cardapio) {
		this.cardapio = cardapio;
	}

	public Estabelecimento(String nome, Endereco endereco, int qtdBanheiros, Pessoa dono, Cardapio cardapio) {
		this.nome = nome;
		this.endereco = endereco;
		this.qtdBanheiros = qtdBanheiros;
		this.dono = dono;
		this.cardapio = cardapio;
	}

	public Estabelecimento() {
	}
	
	public Estabelecimento toDoMain(EstabelecimentoDTO estabelecimentoDTO) {
		ModelMapper mapper = new ModelMapper();
		return mapper.map(estabelecimentoDTO, this.getClass());
	}
	
	public EstabelecimentoDTO toDTO() {
		ModelMapper mapper = new ModelMapper();
		return mapper.map(this, EstabelecimentoDTO.class);
	}
	
	
}
