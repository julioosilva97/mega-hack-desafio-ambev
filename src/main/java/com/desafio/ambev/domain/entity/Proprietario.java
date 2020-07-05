package com.desafio.ambev.domain.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.modelmapper.ModelMapper;

import com.desafio.ambev.api.dto.ProprietarioDTO;

@SuppressWarnings("serial")
@Entity
@Table(name = "PROPRIETARIO")

public class Proprietario extends  Pessoa{
	
	public Proprietario() {
	}

	public Proprietario(String nome, String celular, LocalDate dataNascimento, Usuario usuario) {
		super(nome, celular, dataNascimento, usuario);
	}
	
	public Proprietario toDoMain(ProprietarioDTO proprietarioDTO) {
		
		ModelMapper mapper = new ModelMapper();
		
		return mapper.map(proprietarioDTO, this.getClass());
	}
	
	public ProprietarioDTO toDTO() {
		
		ModelMapper mapper = new ModelMapper();
		return mapper.map(this, ProprietarioDTO.class);
	}

}
