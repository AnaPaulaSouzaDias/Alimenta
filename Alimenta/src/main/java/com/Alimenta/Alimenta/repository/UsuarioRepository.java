package com.Alimenta.Alimenta.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Alimenta.Alimenta.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	public List <Usuario> findAllByNomeContainingIgnoreCase (String nome);
}
