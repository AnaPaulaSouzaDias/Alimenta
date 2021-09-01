package com.Alimenta.Alimenta.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_tema")
public class Tema {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private long id;
	 
	 private boolean fomeZero;
	 
	 private boolean segurancaAlimentar;
	 
	 private boolean agriculturaSustentavel;
	 
	 private String selecao;	
	
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

	public String getSelecao() {
		return selecao;
	}

	public void setSelecao(String selecao) {
		this.selecao = selecao;
	}
}
