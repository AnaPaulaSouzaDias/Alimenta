package com.Alimenta.Alimenta.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;

import com.Alimenta.Alimenta.repository.PostagemRepository;
import com.Alimenta.Alimenta.model.Postagem;

public class PostagemService {
	
	@Autowired
	private PostagemRepository repository;

	private <postagem> Postagem buscarPostagemPorId(Long id) {

		Postagem buscapostagem = repository.findById(id).orElse(null);

		if (buscapostagem != null) {

			return buscapostagem;
			
		} else {

			throw new EmptyResultDataAccessException(1);
		}

	}
	
	public Postagem curtir (Long id) {
		
		Postagem postagem = buscarPostagemPorId(id);
		
		postagem.setCurtidas(postagem.getCurtidas() + 1);
		
		return repository.save(postagem);
		
	}
	
	
	public Postagem descurtir(Long id) {
		
		Postagem postagem = buscarPostagemPorId(id);
		
		if (postagem.getCurtidas() > 0) {
			postagem.setCurtidas(postagem.getCurtidas() - 1);
		} else {
			postagem.setCurtidas(0);
		}
		
		return repository.save(postagem);
				
	}


}
