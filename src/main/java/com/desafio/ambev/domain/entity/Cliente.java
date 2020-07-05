package com.desafio.ambev.domain.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.modelmapper.ModelMapper;

import com.desafio.ambev.api.dto.ClienteDTO;

@SuppressWarnings("serial")
@Entity
@Table(name = "CLIENTE")
public class Cliente extends Pessoa {

	public Cliente() {
	}

	public Cliente(String nome, String celular, Endereco endereco, LocalDate dataNascimento, Usuario usuario) {
		super(nome, celular, endereco, dataNascimento, usuario);
	}
	
	public Cliente toDoMain(ClienteDTO clienteDTO) {
		
		ModelMapper mapper = new ModelMapper();
		
		return mapper.map(clienteDTO, this.getClass());
	}
	
	public ClienteDTO toDTO() {
		
		ModelMapper mapper = new ModelMapper();
		return mapper.map(this, ClienteDTO.class);
	}
}
