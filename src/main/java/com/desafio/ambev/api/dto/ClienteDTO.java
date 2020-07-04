package com.desafio.ambev.api.dto;

import javax.validation.constraints.NotBlank;

import com.sun.istack.NotNull;

public class ClienteDTO {
	
	private Long id;
	
	@NotBlank
	private String nome;
	
	@NotNull
	private String celular;
	
	private EnderecoDTO endereco;
	
	private UsuarioDTO usuario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public EnderecoDTO getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoDTO endereco) {
		this.endereco = endereco;
	}

	public UsuarioDTO getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioDTO usuario) {
		this.usuario = usuario;
	}

	
}
