package com.desafio.ambev.domain.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.modelmapper.ModelMapper;

import com.desafio.ambev.api.dto.EventoDTO;
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
	
	private String descricao;
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
	
	public Evento() {
	}
	
	public EventoDTO toDTO() {
		ModelMapper mapper = new ModelMapper();
		return mapper.map(this, EventoDTO.class);
	}
	
	public Evento toDoMain(EventoDTO eventoDTO) {
		ModelMapper mapper = new  ModelMapper();
		return mapper.map(eventoDTO, this.getClass());
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
