package com.desafio.ambev.domain.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio.ambev.domain.entity.Cardapio;
import com.desafio.ambev.domain.repository.CardapioDAO;

@Service @Transactional
public class CardapioServiceImpl implements CardapioService {

	@Autowired
	CardapioDAO cardapioDAO;
	
	@Override
	public void salvar(Cardapio cardapio) {
		
		
		
		cardapioDAO.save(cardapio);
		
	}

	@Override
	public Cardapio buscarPorId(Long id) {
		
		return cardapioDAO.findById(id);
		
	}

	@Override
	public void alterar(Cardapio cardapio) {
		
		 cardapioDAO.update(cardapio);
		
	}

	@Override
	public List<Cardapio> listarTodos() {
		// TODO Auto-generated method stub
		return cardapioDAO.findAll();
	}

	
}
