package com.desafio.ambev.domain.repository;

import java.util.List;

import com.desafio.ambev.domain.entity.Evento;

public interface EventoDAO {

	public void save(Evento evento);
	public void update(Evento evento);
	public void delete (Long id);
	public Evento findById(Long id);
	
	List<Evento> findAll();
}
