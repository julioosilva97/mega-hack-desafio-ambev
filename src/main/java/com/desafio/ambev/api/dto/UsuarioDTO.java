package com.desafio.ambev.api.dto;


import javax.validation.constraints.NotBlank;


import com.sun.istack.NotNull;

public class UsuarioDTO {

	@NotBlank
	private String email ;
	private String senha;
	@NotNull
	private String perfil;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getPerfil() {
		return perfil;
	}
	public void setPerfil(String perfil) {
		this.perfil = perfil;
	} 
	
	
}
