package com.desafio.ambev.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.desafio.ambev.domain.entity.Estabelecimento;
import com.desafio.ambev.domain.repository.EstabelecimentoDAO;

@Service @Transactional
public class EstabelecimentoServiceImpl implements EstabelecimentoService {

	@Autowired 
	EstabelecimentoDAO estabelecimentoDAO;
	


	@Override
	public void salvar(Estabelecimento estabelecimento) {
		
		estabelecimentoDAO.save(estabelecimento);
	}

	@Override
	public void atualizar(Estabelecimento estabelecimento) {
		
		estabelecimentoDAO.update(estabelecimento);
	}

	@Override
	public Estabelecimento buscarPorId(Long id) {
		return estabelecimentoDAO.findById(id);
	}

	@Override
	public List<Estabelecimento> listarTodos() {
		return estabelecimentoDAO.findAll();
	}

	@Override
	public void excluirPorId(Long id) {
		
		estabelecimentoDAO.delete(id);
		
	}
	
	
}
