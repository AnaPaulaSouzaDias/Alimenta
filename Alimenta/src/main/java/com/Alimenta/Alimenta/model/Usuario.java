package com.Alimenta.Alimenta.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@Entity
//@Table(name = "tb_usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank
    private String tipoUsuario;

    @NotBlank
    @Size(min=5)
    private String nome;

    @NotBlank
    @Email
    private String login;

    @NotBlank
    @Size(min=8, max=15)
    private String senha;
    
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    @JsonIgnoreProperties ("usuario")
    private List <Postagem> postagem;

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