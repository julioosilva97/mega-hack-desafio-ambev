package com.desafio.ambev.domain.repository;

import org.springframework.stereotype.Repository;

import com.desafio.ambev.domain.entity.Cliente;
import com.desafio.ambev.domain.entity.Proprietario;

@Repository
public class ProprietarioDAOImpl extends AbstractDao<Proprietario, Long> implements ProprietarioDAO {

}
