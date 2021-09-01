package com.Alimenta.Alimenta.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Alimenta.Alimenta.model.Tema;

public interface TemaRepository extends JpaRepository<Tema, Long> {

	public List<Tema> findBySelecaoContainingIgnoreCase(String selecao);
	
}