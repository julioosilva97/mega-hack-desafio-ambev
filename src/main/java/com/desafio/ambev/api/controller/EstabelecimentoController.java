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

import com.desafio.ambev.api.dto.EstabelecimentoDTO;
import com.desafio.ambev.domain.entity.Estabelecimento;
import com.desafio.ambev.domain.service.EstabelecimentoService;

@RestController
@RequestMapping("estabelecimento")
public class EstabelecimentoController {

	@Autowired 
	EstabelecimentoService service;
	
	@PostMapping("salvar")
	public ResponseEntity<Void>salvar(@Valid @RequestBody EstabelecimentoDTO estabelecimentoDTO ){
		
		Estabelecimento estabelecimento = new Estabelecimento();
		
		estabelecimento = estabelecimento.toDoMain(estabelecimentoDTO);
		
		service.salvar(estabelecimento);
		
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@PatchMapping("buscar/{id}")
	public ResponseEntity<EstabelecimentoDTO> buscar(@PathVariable("id") Long id){
		
		return new ResponseEntity<EstabelecimentoDTO>(service.buscarPorId(id).toDTO(), HttpStatus.OK);
	}
	
	@GetMapping("listar")
	public ResponseEntity<List<EstabelecimentoDTO>>listarTodos(){
		
		List<Estabelecimento> estabelecimentos = service.listarTodos();
		
		return new ResponseEntity<List<EstabelecimentoDTO>>(estabelecimentos.stream()
			.map(estabelecimento -> estabelecimento.toDTO())
			.collect(Collectors.toList()), HttpStatus.OK);
	}
	
	@PutMapping("atualizar")
	public ResponseEntity<Void> atualizar(@Valid @RequestBody EstabelecimentoDTO estabelecimentoDTO){
		Estabelecimento estabelecimento = new Estabelecimento();
		
		estabelecimento = estabelecimento.toDoMain(estabelecimentoDTO);
		service.atualizar(estabelecimento);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@DeleteMapping("deletar/{id}")
	public ResponseEntity<Void> deletar(@PathVariable("id") Long id){
		service.excluirPorId(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	
	
}
