package com.desafio.ambev.domain.repository;

import java.util.List;

import com.desafio.ambev.domain.entity.Estabelecimento;

public interface EstabelecimentoDAO {

	public void save(Estabelecimento estabelecimento);
	public void update (Estabelecimento estabelecimento);
	public void delete (Long id);
	Estabelecimento findById(Long id);
	
	List<Estabelecimento>findAll();
		
	
}
