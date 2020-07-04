package com.desafio.ambev.domain.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.modelmapper.ModelMapper;

import com.desafio.ambev.api.dto.CardapioDTO;
import com.desafio.ambev.api.dto.ClienteDTO;
import com.desafio.ambev.domain.util.AbstractEntity;

@SuppressWarnings("serial")
@Entity
@Table(name = "CARDAPIO")
public class Cardapio extends AbstractEntity<Long> {

	@OneToMany(mappedBy ="cardapio")
	private List<Produto> produtos;

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public Cardapio(List<Produto> produtos) {
		this.produtos = produtos;
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
