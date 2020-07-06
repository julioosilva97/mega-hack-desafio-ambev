package com.desafio.ambev.api.controller;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.ambev.api.dto.CardapioDTO;
import com.desafio.ambev.domain.entity.Cardapio;
import com.desafio.ambev.domain.service.CardapioService;

@RestController
@RequestMapping("cardapios")
public class CardapioController {

	@Autowired
	CardapioService service;
	
	@PostMapping("salvar")
	public ResponseEntity<Void> salvar(@Valid  @RequestBody CardapioDTO cardapioDTO){
		
		Cardapio cardapio = new Cardapio();
		
		cardapio = cardapio.toDoMain(cardapioDTO);
		
		service.salvar(cardapio);
		
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@GetMapping("listar")
	public ResponseEntity<List<CardapioDTO>>listarProdutos(){
		List<Cardapio> cardapios = service.listarTodos();
		
		
		return new ResponseEntity<List<CardapioDTO>>(cardapios.stream()
				.map(cardapio -> cardapio.toDTO())
				.collect(Collectors.toList()), HttpStatus.OK);
	}
	
	@PatchMapping("buscar/{id}")
	public ResponseEntity<CardapioDTO> buscarPorId(@PathVariable("id") Long id){
		
		return new ResponseEntity<CardapioDTO>(service.buscarPorId(id).toDTO(), HttpStatus.OK);
		
	}
	
	@PutMapping("alterar")
    public ResponseEntity<Void> alterar(@Valid  @RequestBody CardapioDTO cardapioDTO){
		
		
        Cardapio cardapio = new Cardapio();
		
		cardapio = cardapio.toDoMain(cardapioDTO);
		
		
		service.alterar(cardapio);
		
		return new ResponseEntity<Void>(HttpStatus.CREATED);
		
	}
	
	
}
