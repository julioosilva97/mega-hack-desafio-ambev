package com.desafio.ambev.domain.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.desafio.ambev.domain.entity.Proprietario;
import com.desafio.ambev.domain.repository.ProprietarioDAO;

@Service @Transactional
public class ProprietarioServiceImpl implements ProprietarioService {

	@Autowired
	ProprietarioDAO proprietarioDAO;
	
	@Override
	public void salvar(Proprietario proprietario) {
		
		proprietarioDAO.save(proprietario);
	}

	@Override
	public void atualizar(Proprietario proprietario) {
		
		proprietarioDAO.update(proprietario);
	}

	@Override
	public Proprietario buscarPorId(Long id) {
		
		
		return proprietarioDAO.findById(id);
	}

	@Override
	public List<Proprietario> listarTodos() {
		
		return proprietarioDAO.findAll();
	}

	@Override
	public void excluirPorId(Long id) {
		
		proprietarioDAO.delete(id);
		
	}

}
