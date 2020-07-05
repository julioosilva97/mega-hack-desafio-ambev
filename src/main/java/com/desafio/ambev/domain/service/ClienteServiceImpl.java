package com.desafio.ambev.domain.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio.ambev.domain.entity.Cliente;
import com.desafio.ambev.domain.repository.ClienteDAO;

@Service @Transactional
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	ClienteDAO clienteDAO;
	
	@Override
	public void salvar(Cliente cliente) {
		
		clienteDAO.save(cliente);
	}

	@Override
	public void atualizar(Cliente cliente) {
		
		clienteDAO.update(cliente);
	}

	@Override
	public Cliente buscarPorId(Long id) {
		
		
		return clienteDAO.findById(id);
	}

	@Override
	public List<Cliente> listarTodos() {
		
		return clienteDAO.findAll();
	}

	@Override
	public void excluirPorId(Long id) {
		
		clienteDAO.delete(id);
		
	}

}
