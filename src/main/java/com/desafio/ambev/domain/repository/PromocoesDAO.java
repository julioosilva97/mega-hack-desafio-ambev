package com.desafio.ambev.domain.repository;

import java.util.List;

import com.desafio.ambev.domain.entity.Promocoes;

public interface PromocoesDAO {

	public void save(Promocoes promocoes);
	public void update (Promocoes promocoes);
	public void delete (Long id);
	Promocoes findById(Long id);
	
	List<Promocoes>findAll();
		
	
}
