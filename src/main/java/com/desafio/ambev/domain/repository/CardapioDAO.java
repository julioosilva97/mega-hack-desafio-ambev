package com.desafio.ambev.domain.repository;



import java.util.List;

import com.desafio.ambev.domain.entity.Cardapio;

public interface CardapioDAO {
   
	void save(Cardapio cardapio);
    void update(Cardapio cardapio);
    Cardapio findById(Long id);
    //void delete(Long id);
    List<Cardapio> findAll();
	
}
