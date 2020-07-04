package com.desafio.ambev.domain.repository;

import org.springframework.stereotype.Repository;

import com.desafio.ambev.domain.entity.Cliente;

@Repository
public class ClienteDAOImpl extends AbstractDao<Cliente, Long> implements ClienteDAO {

}
