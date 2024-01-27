package com.example.devtrainning.entidades;

public class Usuario {

    private String nomeUsuario;

    public Usuario(int idUsuario, String nomeUsuario, String senha) {
        this.nomeUsuario = nomeUsuario;
    }

    public void login() {

    }

    public void deslogar() {

    }

    public void alterarLogin(String novoNomeUsuario, String novaSenha) {
        this.nomeUsuario = novoNomeUsuario;

    }

    public Object getId_usuariosRepositorio() {
        return null;
    }
}
