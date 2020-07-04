package com.desafio.ambev.domain.service;

import com.desafio.ambev.domain.entity.Cardapio;

public interface CardapioService {

	void salvar(Cardapio cardapio);
	void buscarPorId(Long id);
	void alterar(Cardapio cardapio);
}
