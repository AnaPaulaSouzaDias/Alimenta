package com.Alimenta.Alimenta.model;

import java.sql.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

//@Entity
//@Table(name = "tb_postagem")
public class Postagem {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	
	@NotBlank
	@Size(min=6,max=20)
	private String titulo;
	
	@NotBlank
	@Size(min=50,max=500)
	private String texto;
	
	private boolean imagem;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
	private Date dataHora;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public boolean isImagem() {
		return imagem;
	}

	public void setImagem(boolean imagem) {
		this.imagem = imagem;
	}

	public Date getDataHora() {
		return dataHora;
	}

	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}
	
	
}
