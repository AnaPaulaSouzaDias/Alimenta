package com.Alimenta.Alimenta.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_tema")
public class Tema {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private long id;
	 
	 private boolean fomeZero;
	 
	 private boolean segurancaAlimentar;
	 
	 private boolean agriculturaSustentavel;
	 
	 @NotBlank
	 @Size (min= 8,max=100) 
	 private String palavraChave;
	 
	 @OneToMany(mappedBy = "tema", cascade = CascadeType.ALL)
     @JsonIgnoreProperties ("tema")
     private List <Postagem> postagem;
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public boolean isFomeZero() {
		return fomeZero;
	}

	public void setFomeZero(boolean fomeZero) {
		this.fomeZero = fomeZero;
	}

	public boolean isSegurancaAlimentar() {
		return segurancaAlimentar;
	}

	public void setSegurancaAlimentar(boolean segurancaAlimentar) {
		this.segurancaAlimentar = segurancaAlimentar;
	}

	public boolean isAgriculturaSustentavel() {
		return agriculturaSustentavel;
	}

	public void setAgriculturaSustentavel(boolean agriculturaSustentavel) {
		this.agriculturaSustentavel = agriculturaSustentavel;
	}

	public String getPalavraChave() {
		return palavraChave;
	}

	public void setPalavraChave(String palavraChave) {
		this.palavraChave = palavraChave;
	}
	
	public List<Postagem> getPostagem() {
		return postagem;
	}

	public void setPostagem(List<Postagem> postagem) {
		this.postagem = postagem;
	}
}