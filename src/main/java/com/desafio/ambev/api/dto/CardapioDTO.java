package com.desafio.ambev.api.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

<<<<<<< HEAD
import org.hibernate.annotations.Cascade;
=======
import com.desafio.ambev.domain.entity.Estabelecimento;
>>>>>>> ad46817a1566c85745c4c4335991c62d6477e6f4

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
