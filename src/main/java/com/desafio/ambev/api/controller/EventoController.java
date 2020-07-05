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

import com.desafio.ambev.api.dto.EventoDTO;
import com.desafio.ambev.domain.entity.Evento;
import com.desafio.ambev.domain.service.EventoService;

@RestController
@RequestMapping("eventos")
public class EventoController {

	@Autowired
	EventoService service;
	
	@PostMapping("salvar")
	public ResponseEntity<Void>salvar(@Valid @RequestBody EventoDTO eventoDTO){
		Evento evento = new Evento();
		evento = evento.toDoMain(eventoDTO);
		service.salvar(evento);
		
		return new ResponseEntity<Void>(HttpStatus.CREATED);
		
	}
	
	@PatchMapping("buscar/{id}")
	public ResponseEntity<EventoDTO> buscar(@PathVariable("id") Long id){
		return new ResponseEntity<EventoDTO>(service.buscarPorId(id).toDTO(), HttpStatus.OK);
	}
	
	@GetMapping("listar")
	public ResponseEntity<List<EventoDTO>>listarTodos(){
		List<Evento> eventos = service.listarTodos();
		
		return new ResponseEntity<List<EventoDTO>>(eventos.stream()
				.map(evento -> evento.toDTO())
				.collect(Collectors.toList()), HttpStatus.CREATED);
	}
	
	@PutMapping("atualizar")
	public ResponseEntity<Void>atualizar(@Valid @RequestBody EventoDTO eventoDTO){
		Evento evento = new Evento();
		
		evento = evento.toDoMain(eventoDTO);
		service.atualizar(evento);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@DeleteMapping("deletar/{id}")
	public ResponseEntity<Void>deletar(@PathVariable("id") Long id){
		service.excluirPorId(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
}
