package com.Alimenta.Alimenta.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Table(name = "tb_tema")
public class tema {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private long id;
	 
	 private boolean fomeZero;
	 
	 private boolean segurancaAlimentar;
	 
	 private boolean agriculturaSustentavel;

	public boolean isFome_zero() {
		return fomeZero;
	}

	public void setFome_zero(boolean fome_zero) {
		this.fomeZero = fome_zero;
	}

	public boolean isSeguranca_alimentar() {
		return segurancaAlimentar;
	}

	public void setSeguranca_alimentar(boolean seguranca_alimentar) {
		this.segurancaAlimentar = seguranca_alimentar;
	}

	public boolean isAgricultura_sustentavel() {
		return agriculturaSustentavel;
	}

	public void setAgricultura_sustentavel(boolean agricultura_sustentavel) {
		this.agriculturaSustentavel = agricultura_sustentavel;
	}
	 
}
