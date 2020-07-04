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

import com.desafio.ambev.api.dto.ProprietarioDTO;
import com.desafio.ambev.domain.entity.Proprietario;
import com.desafio.ambev.domain.service.ProprietarioService;

@RestController
@RequestMapping("proprietarios")
public class ProprietarioController {

	@Autowired
	ProprietarioService service;
	
	
	@PostMapping("salvar")
	public ResponseEntity<Void> salvar(@Valid @RequestBody ProprietarioDTO proprietarioDTO) {
		
		Proprietario proprietario = new Proprietario();
		
		proprietario = proprietario.toDoMain(proprietarioDTO);
		
		service.salvar(proprietario);
		
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@PatchMapping("buscar/{id}")
	public ResponseEntity<ProprietarioDTO> buscar(@PathVariable("id") Long id){
		
		return new ResponseEntity<ProprietarioDTO>(service.buscarPorId(id).toDTO(), HttpStatus.OK);
		
	}
	
	@GetMapping("listar")
	public ResponseEntity<List<ProprietarioDTO>> listarTodos(){
		
		List<Proprietario> proprietarios = service.listarTodos();
		
		return new ResponseEntity<List<ProprietarioDTO>>(proprietarios.stream()
				.map(proprietario -> proprietario.toDTO())
				.collect(Collectors.toList()), HttpStatus.OK);
		
	}
	
	@PutMapping("atualizar")
    public ResponseEntity<Void> atualizar(@Valid @RequestBody ProprietarioDTO proprietarioDTO) {
		
		Proprietario proprietario = new Proprietario();
		
		proprietario = proprietario.toDoMain(proprietarioDTO);
		
		service.atualizar(proprietario);
		
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@DeleteMapping("deletar/{id}")
     public ResponseEntity<Void> deletar(@PathVariable("id") Long id){
		
		service.excluirPorId(id);
		
		return new ResponseEntity<Void>(HttpStatus.OK);
		
	}
	
}
