package com.desafio.ambev.domain.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import com.desafio.ambev.domain.util.AbstractEntity;
import com.desafio.ambev.domain.util.TipoProduto;

@SuppressWarnings("serial")
@Entity
@Table(name = "PRODUTO")
public class Produto extends AbstractEntity<Long>  {
	
	private String nome;
	private BigDecimal valor;
	private TipoProduto tipo;
	
	
	@ManyToOne
	@JoinColumn(name="id_cardapio")
	private Cardapio cardapio;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public Produto(String nome, BigDecimal valor,TipoProduto tipo) {
		this.nome = nome;
		this.valor = valor;
		this.tipo = tipo;
	}
	public TipoProduto getTipo() {
		return tipo;
	}
	public void setTipo(TipoProduto tipo) {
		this.tipo = tipo;
	}
	public Produto() {
	}
	
}
