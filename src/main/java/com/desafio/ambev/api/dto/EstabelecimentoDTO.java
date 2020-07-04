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
}
