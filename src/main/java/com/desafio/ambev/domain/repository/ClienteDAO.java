package com.desafio.ambev.domain.repository;

import java.util.List;



import com.desafio.ambev.domain.entity.Cliente;

public interface ClienteDAO {

     void save(Cliente cliente);
     void update(Cliente cliente);
     void delete(Long id);
     Cliente findById(Long id);
    
     List<Cliente> findAll();
}
