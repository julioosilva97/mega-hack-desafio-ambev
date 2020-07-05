package com.desafio.ambev.domain.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.modelmapper.ModelMapper;

import com.desafio.ambev.api.dto.EstabelecimentoDTO;
import com.desafio.ambev.api.dto.EstabelecimentoUpdateDTO;
import com.desafio.ambev.domain.util.AbstractEntity;

@SuppressWarnings("serial")
@Entity
@Table(name = "ESTABELECIMENTO")
public class Estabelecimento extends AbstractEntity<Long> {

	private String nome;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id_endereco")
	private Endereco endereco;
	
	private int qtdBanheiros;
	
	@OneToOne
	@JoinColumn(name="id_proprietario")
	private Proprietario proprietario;
	
	@OneToOne(mappedBy = "estabelecimento")
	private Cardapio cardapio;
	
	@OneToMany(mappedBy ="estabelecimento",cascade = CascadeType.ALL)
	private List <Evento> eventos;
	
	@OneToMany(mappedBy ="estabelecimento",cascade = CascadeType.ALL)
	private List <Promocoes> promocoes;

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

	

	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}

	public List<Evento> getEventos() {
		return eventos;
	}

	public void setEventos(List<Evento> eventos) {
		this.eventos = eventos;
	}

	public Cardapio getCardapio() {
		return cardapio;
	}

	public void setCardapio(Cardapio cardapio) {
		this.cardapio = cardapio;
	}

	public Estabelecimento(String nome, Endereco endereco, int qtdBanheiros, Proprietario proprietario, Cardapio cardapio) {
		this.nome = nome;
		this.endereco = endereco;
		this.qtdBanheiros = qtdBanheiros;
		this.proprietario = proprietario;
		this.cardapio = cardapio;
	}

	public Estabelecimento() {
	}
	
	public Estabelecimento toDoMain(EstabelecimentoDTO estabelecimentoDTO) {
		ModelMapper mapper = new ModelMapper();
		return mapper.map(estabelecimentoDTO, this.getClass());
	}
	
	public Estabelecimento toDoMain(EstabelecimentoUpdateDTO estabelecimentoDTO) {
		ModelMapper mapper = new ModelMapper();
		return mapper.map(estabelecimentoDTO, this.getClass());
	}
	
	public EstabelecimentoDTO toDTO() {
		ModelMapper mapper = new ModelMapper();
		return mapper.map(this, EstabelecimentoDTO.class);
	}
	
	
}
