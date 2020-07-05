package com.desafio.ambev.domain.entity;



import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.desafio.ambev.domain.util.AbstractEntity;
import com.desafio.ambev.domain.util.Perfil;


@SuppressWarnings("serial")
@Entity
@Table(name = "USUARIO")
public class Usuario extends AbstractEntity<Long> {
	
	private String email ;
	private String senha;
	
	@Enumerated(EnumType.STRING)
	private Perfil perfil; 
	
	private Boolean ativo ;

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
		if(senha!=null) {
			this.senha = new BCryptPasswordEncoder().encode(senha);
		}else {
			this.senha = senha;
		}
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public Usuario() {
	}

	public Usuario(String email, String senha, Perfil perfil, Boolean ativo) {
		this.email = email;
		this.senha = senha;
		this.perfil = perfil;
		this.ativo = ativo;
	}
	
}
