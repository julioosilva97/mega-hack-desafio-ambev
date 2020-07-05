package com.desafio.ambev.domain.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.modelmapper.ModelMapper;

import com.desafio.ambev.api.dto.PromocoesDTO;
import com.desafio.ambev.domain.util.AbstractEntity;

@SuppressWarnings("serial")
@Entity
@Table(name = "PROMOCOES")
public class Promocoes extends AbstractEntity<Long> {

	private String descricao;

	@OneToMany
	@JoinColumn(name="id_estabelecimento")
	private Estabelecimento estabelecimento;
	
	@OneToMany(mappedBy ="promocoes",cascade = CascadeType.ALL)
	private List <Produto> produtos;

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

	public Promocoes(String descricao, Estabelecimento estabelecimento, List<Produto> produtos) {
		this.descricao = descricao;
		this.estabelecimento = estabelecimento;
		this.produtos = produtos;
	}

	public Promocoes() {
	}
	
	public Promocoes toDoMain(PromocoesDTO promocoesDTO) {
		ModelMapper mapper = new ModelMapper();
		return mapper.map(promocoesDTO, this.getClass());
	}
	
	public PromocoesDTO toDTO() {
		ModelMapper mapper = new ModelMapper();
		return mapper.map(this, PromocoesDTO.class);
	}
	
	
}
