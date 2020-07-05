package com.desafio.ambev.api.dto;

import java.time.LocalDateTime;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

public class EventoDTO {

	private Long id;
	private String nome;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm")
	@NotNull
	private LocalDateTime dataHoraInicio;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm")
	@NotNull
	private LocalDateTime dataHoraFim;
	
	private String descricao;
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
	public LocalDateTime getDataHoraInicio() {
		return dataHoraInicio;
	}
	public void setDataHoraInicio(LocalDateTime dataHoraInicio) {
		this.dataHoraInicio = dataHoraInicio;
	}
	public LocalDateTime getDataHoraFim() {
		return dataHoraFim;
	}
	public void setDataHoraFim(LocalDateTime dataHoraFim) {
		this.dataHoraFim = dataHoraFim;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
