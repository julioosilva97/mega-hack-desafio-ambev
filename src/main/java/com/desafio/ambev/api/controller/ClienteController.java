package com.desafio.ambev.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.desafio.ambev.domain.entity.Cliente;
import com.desafio.ambev.domain.service.ClienteService;

@RestController
@RequestMapping("clientes")
public class ClienteController {

	@Autowired
	ClienteService service;
	
	
	@PostMapping("salvar")
	public ResponseEntity<Void> salvar(/*@Valid @RequestBody ClienteDTO clienteDTO*/) {
		
		Cliente cliente = new Cliente();
		
		cliente.setNome("Julio");
		
		//cliente = cliente.toDoMain(clienteDTO);
		
		service.salvar(cliente);
		
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	
}
