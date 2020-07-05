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


import com.desafio.ambev.api.dto.PromocoesDTO;
import com.desafio.ambev.domain.entity.Promocoes;
import com.desafio.ambev.domain.service.PromocoesService;

@RestController
@RequestMapping("promocoes")
public class PromocoesController {

	@Autowired 
	PromocoesService service;
	
	@PostMapping("salvar")
	public ResponseEntity<Void>salvar(@Valid @RequestBody PromocoesDTO promocaoDTO ){
		
		Promocoes promocao = new Promocoes();
		
		promocao = promocao.toDoMain(promocaoDTO);
		
		service.salvar(promocao);
		
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@PatchMapping("buscar/{id}")
	public ResponseEntity<PromocoesDTO> buscar(@PathVariable("id") Long id){
		
		return new ResponseEntity<PromocoesDTO>(service.buscarPorId(id).toDTO(), HttpStatus.OK);
	}
	
	@GetMapping("listar")
	public ResponseEntity<List<PromocoesDTO>>listarTodos(){
		
		List<Promocoes> promocoes = service.listarTodos();
		
		return new ResponseEntity<List<PromocoesDTO>>(promocoes.stream()
			.map(promocao -> promocao.toDTO())
			.collect(Collectors.toList()), HttpStatus.OK);
	}
	
	@PutMapping("atualizar")
	public ResponseEntity<Void> atualizar(@Valid @RequestBody PromocoesDTO promocoesDTO){
		Promocoes promocoes = new Promocoes();
		
		promocoes = promocoes.toDoMain(promocoesDTO);
		service.atualizar(promocoes);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@DeleteMapping("deletar/{id}")
	public ResponseEntity<Void> deletar(@PathVariable("id") Long id){
		service.excluirPorId(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	
	
}
