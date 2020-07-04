package com.desafio.ambev.domain.service;

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

}
