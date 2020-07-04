package com.desafio.ambev.domain.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.desafio.ambev.domain.util.AbstractEntity;

@SuppressWarnings("serial")
@Entity
@Table(name = "EVENTO")
public class Evento extends AbstractEntity<Long> {

	private String nome;
	private LocalDateTime dataHoraInicio;
	private LocalDateTime dataHoraFim;
	@ManyToOne
	@JoinColumn(name="id_estabelecimento")
	private Estabelecimento estabelecimento;
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
	public Estabelecimento getEstabelecimento() {
		return estabelecimento;
	}
	public void setEstabelecimento(Estabelecimento estabelecimento) {
		this.estabelecimento = estabelecimento;
	}
	public Evento(String nome, LocalDateTime dataHoraInicio, LocalDateTime dataHoraFim,
			Estabelecimento estabelecimento) {
		this.nome = nome;
		this.dataHoraInicio = dataHoraInicio;
		this.dataHoraFim = dataHoraFim;
		this.estabelecimento = estabelecimento;
	}
	public Evento() {
	}
	
}
