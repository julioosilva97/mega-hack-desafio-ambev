package com.desafio.ambev.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.desafio.ambev.domain.entity.Promocoes;
import com.desafio.ambev.domain.repository.PromocoesDAO;

@Service @Transactional
public class PromocoesServiceImpl implements PromocoesService {

	@Autowired 
	PromocoesDAO promocoesDAO;

	@Override
	public void salvar(Promocoes promocoes) {
		
		promocoesDAO.save(promocoes);
	}

	@Override
	public void atualizar(Promocoes promocoes) {
		
		promocoesDAO.update(promocoes);
	}

	@Override
	public Promocoes buscarPorId(Long id) {
		return promocoesDAO.findById(id);
	}

	@Override
	public List<Promocoes> listarTodos() {
		return promocoesDAO.findAll();
	}

	@Override
	public void excluirPorId(Long id) {
		
		promocoesDAO.delete(id);
		
	}
	
	
}
