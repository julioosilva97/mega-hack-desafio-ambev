package com.desafio.ambev.domain.service;

import java.util.List;

import com.desafio.ambev.domain.entity.Evento;

public interface EventoService {

	public void salvar(Evento evento);
	public void atualizar(Evento evento);
	public Evento buscarPorId(Long id);
	List<Evento> listarTodos();
	public void excluirPorId(Long id);
}
