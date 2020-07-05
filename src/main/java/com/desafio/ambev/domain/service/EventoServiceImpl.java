package com.desafio.ambev.domain.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio.ambev.domain.entity.Evento;
import com.desafio.ambev.domain.repository.EventoDAO;

@Service @Transactional
public class EventoServiceImpl implements EventoService{
	
	@Autowired
	EventoDAO eventoDAO;

	@Override
	public void salvar(Evento evento) {
		
		eventoDAO.save(evento);
	}

	@Override
	public void atualizar(Evento evento) {
		eventoDAO.update(evento);
	}

	@Override
	public Evento buscarPorId(Long id) {
		
		return eventoDAO.findById(id);
	}

	@Override
	public List<Evento> listarTodos() {
		// TODO Auto-generated method stub
		return eventoDAO.findAll();
	}

	@Override
	public void excluirPorId(Long id) {
		
		eventoDAO.delete(id);
	}

}
