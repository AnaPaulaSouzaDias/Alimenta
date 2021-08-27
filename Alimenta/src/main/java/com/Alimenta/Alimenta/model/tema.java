package com.Alimenta.Alimenta.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_tema")
public class tema {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private long id_tema;
	 
	 private boolean fome_zero;
	 
	 private boolean seguranca_alimentar;
	 
	 private boolean agricultura_sustentavel;

	public boolean isFome_zero() {
		return fome_zero;
	}

	public void setFome_zero(boolean fome_zero) {
		this.fome_zero = fome_zero;
	}

	public boolean isSeguranca_alimentar() {
		return seguranca_alimentar;
	}

	public void setSeguranca_alimentar(boolean seguranca_alimentar) {
		this.seguranca_alimentar = seguranca_alimentar;
	}

	public boolean isAgricultura_sustentavel() {
		return agricultura_sustentavel;
	}

	public void setAgricultura_sustentavel(boolean agricultura_sustentavel) {
		this.agricultura_sustentavel = agricultura_sustentavel;
	}
	 
}
