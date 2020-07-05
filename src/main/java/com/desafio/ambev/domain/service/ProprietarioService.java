package com.desafio.ambev.domain.service;

import java.util.List;

import com.desafio.ambev.domain.entity.Proprietario;

public interface ProprietarioService {
	
	void salvar (Proprietario proprietario);
	void atualizar(Proprietario proprietario);
	Proprietario buscarPorId(Long id);
	List<Proprietario> listarTodos();
	void excluirPorId(Long id);
}
