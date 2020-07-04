package com.desafio.ambev.domain.service;

import java.util.List;

import com.desafio.ambev.domain.entity.Estabelecimento;

public interface EstabelecimentoService {

	public void salvar(Estabelecimento estabelecimento);
	public void atualizar(Estabelecimento estabelecimento);
	Estabelecimento buscarPorId(Long id);
	List<Estabelecimento> listarTodos();
	public void excluirPorId(Long id);
}
