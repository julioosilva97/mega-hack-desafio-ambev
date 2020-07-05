package com.desafio.ambev.domain.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

import com.desafio.ambev.domain.util.AbstractEntity;

@SuppressWarnings("serial")
@MappedSuperclass
public abstract class Pessoa extends AbstractEntity<Long> {

	protected String nome;
	protected String celular;
	
	
	protected LocalDate dataNascimento;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_usuario")
	protected Usuario usuario;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Pessoa() {
	}
	public Pessoa(String nome, String celular, LocalDate dataNascimento, Usuario usuario) {
		super();
		this.nome = nome;
		this.celular = celular;
		this.dataNascimento = dataNascimento;
		this.usuario = usuario;
	}
	
}
