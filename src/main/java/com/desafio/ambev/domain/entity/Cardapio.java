package com.desafio.ambev.domain.entity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import org.modelmapper.ModelMapper;

import com.desafio.ambev.api.dto.CardapioDTO;
import com.desafio.ambev.api.dto.ClienteDTO;
import com.desafio.ambev.domain.util.AbstractEntity;

@SuppressWarnings("serial")
@Entity
@Table(name = "CARDAPIO")
public class Cardapio extends AbstractEntity<Long> {



	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_estabelecimento")
	private Estabelecimento estabelecimento; 
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="id_cardapio")
	private Set<Produto> produtos = new HashSet<>();

	

	public Estabelecimento getEstabelecimento() {
		return estabelecimento;
	}

	public void setEstabelecimento(Estabelecimento estabelecimento) {
		this.estabelecimento = estabelecimento;
	}

	public Set<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(Set<Produto> produtos) {
		this.produtos = produtos;
	}

	public Estabelecimento getEstebelecimento() {
		return estabelecimento;
	}

	public void setEstebelecimento(Estabelecimento estabelecimento) {
		this.estabelecimento = estabelecimento;
	}

	
	public CardapioDTO toDTO() {
		
		ModelMapper mapper = new ModelMapper();
		return mapper.map(this, CardapioDTO.class);
	}
	
	public Cardapio toDoMain(CardapioDTO cardapioDTO) {
		
		ModelMapper mapper = new ModelMapper();
		return mapper.map(cardapioDTO, this.getClass());
	}

	public Cardapio() {
	}
}
