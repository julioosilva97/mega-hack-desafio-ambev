package com.desafio.ambev.domain.repository;

import org.springframework.stereotype.Repository;

import com.desafio.ambev.domain.entity.Evento;

@Repository
public class EventoDAOImpl extends AbstractDao<Evento, Long> implements EventoDAO {
	
}
