package com.desafio.ambev.api.controller;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.ambev.api.dto.ClienteDTO;
import com.desafio.ambev.domain.entity.Cliente;
import com.desafio.ambev.domain.service.ClienteService;

@RestController
@RequestMapping("clientes")
public class ClienteController {

	@Autowired
	ClienteService service;
	
	
	@PostMapping("salvar")
	public ResponseEntity<Void> salvar(@Valid @RequestBody ClienteDTO clienteDTO) {
		
		Cliente cliente = new Cliente();
		
		cliente = cliente.toDoMain(clienteDTO);
		
		service.salvar(cliente);
		
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@PatchMapping("buscar/{id}")
	public ResponseEntity<ClienteDTO> buscar(@PathVariable("id") Long id){
		
		return new ResponseEntity<ClienteDTO>(service.buscarPorId(id).toDTO(), HttpStatus.OK);
		
	}
	
	@GetMapping("listar")
	public ResponseEntity<List<ClienteDTO>> listarTodos(){
		
		List<Cliente> clientes = service.listarTodos();
		
		return new ResponseEntity<List<ClienteDTO>>(clientes.stream()
				.map(cliente -> cliente.toDTO())
				.collect(Collectors.toList()), HttpStatus.OK);
		
	}
	
	@PutMapping("atualizar")
    public ResponseEntity<Void> atualizar(@Valid @RequestBody ClienteDTO clienteDTO) {
		
		Cliente cliente = new Cliente();
		
		cliente = cliente.toDoMain(clienteDTO);
		
		service.atualizar(cliente);
		
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@DeleteMapping("deletar/{id}")
     public ResponseEntity<Void> deletar(@PathVariable("id") Long id){
		
		service.excluirPorId(id);
		
		return new ResponseEntity<Void>(HttpStatus.OK);
		
	}
	
	
}
