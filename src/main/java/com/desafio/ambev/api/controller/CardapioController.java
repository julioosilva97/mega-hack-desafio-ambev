package com.desafio.ambev.api.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
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
	public ResponseEntity<Void> salvar(@Valid CardapioDTO cardapioDTO){
		
		Cardapio cardapio = new Cardapio();
		
		cardapio = cardapio.toDoMain(cardapioDTO);
		
		service.salvar(cardapio);
		
		return null;
	}
	
}
