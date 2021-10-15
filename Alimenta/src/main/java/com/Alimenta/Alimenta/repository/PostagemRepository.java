package com.Alimenta.Alimenta.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Alimenta.Alimenta.model.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {
	public List <Postagem> findAllByTituloContainingIgnoreCase (String titulo);

	public List<Postagem> findAllByUsuario_Id(Long id);
	
	public List<Postagem> findAllByTema_TemaContainingIgnoreCase(String tema);
}
