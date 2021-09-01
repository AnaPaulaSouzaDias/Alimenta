package com.Alimenta.Alimenta.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

//@Entity
//@Table(name = "tb_usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank
    private String tipoUsuario;

    @NotBlank
    private String nome;

    @NotBlank
    @Email
    private String login;

    @NotBlank
    @Size(min=8, max=15)
    private String senha;

    public String getTipo_usuario() {
        return tipoUsuario;
    }

    public void setTipo_usuario(String tipo_usuario) {
        this.tipoUsuario = tipo_usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}