package com.desafio.ambev.domain.repository;

import java.util.List;



import com.desafio.ambev.domain.entity.Cliente;
import com.desafio.ambev.domain.entity.Proprietario;

public interface ProprietarioDAO {

     void save(Proprietario proprietario);
     void update(Proprietario proprietario);
     void delete(Long id);
     Proprietario findById(Long id);
    
     List<Proprietario> findAll();
}
