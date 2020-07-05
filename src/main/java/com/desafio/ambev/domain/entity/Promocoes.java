package com.desafio.ambev.domain.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.modelmapper.ModelMapper;

import com.desafio.ambev.api.dto.PromocoesDTO;
import com.desafio.ambev.domain.util.AbstractEntity;

@SuppressWarnings("serial")
@Entity
@Table(name = "PROMOCOES")
public class Promocoes extends AbstractEntity<Long> {

	private String descricao;

	@ManyToOne
	@JoinColumn(name="id_estabelecimento")
	private Estabelecimento estabelecimento;
	
	

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

	public Promocoes(String descricao, Estabelecimento estabelecimento) {
		this.descricao = descricao;
		this.estabelecimento = estabelecimento;
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
