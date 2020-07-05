package com.desafio.ambev.domain.service;

import java.util.List;

import com.desafio.ambev.domain.entity.Cliente;

public interface ClienteService {

	void salvar(Cliente cliente);
	void atualizar(Cliente cliente);
	Cliente buscarPorId(Long id);
	List<Cliente> listarTodos();
	void excluirPorId(Long id);
	
	
}
