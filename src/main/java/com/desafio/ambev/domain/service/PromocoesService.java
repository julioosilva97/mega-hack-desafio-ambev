package com.desafio.ambev.domain.service;

import java.util.List;

import com.desafio.ambev.domain.entity.Promocoes;

public interface PromocoesService {

	public void salvar(Promocoes promocoes);
	public void atualizar(Promocoes promocoes);
	Promocoes buscarPorId(Long id);
	List<Promocoes> listarTodos();
	public void excluirPorId(Long id);
}
