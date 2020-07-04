package com.desafio.ambev.domain.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.desafio.ambev.domain.util.AbstractEntity;

@SuppressWarnings("serial")
@Entity
@Table(name = "CARDAPIO")
public class Cardapio extends AbstractEntity<Long> {

}
