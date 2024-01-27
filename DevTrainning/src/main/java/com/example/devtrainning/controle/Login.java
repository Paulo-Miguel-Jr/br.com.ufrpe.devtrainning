package com.example.devtrainning.controle;

public class Login {

    private String usuario;
    private String senha;

    public Login(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public boolean verificarUsuario(String usuario, String senha) {
        return this.usuario.equals(usuario) && this.senha.equals(senha);
    }

    public static void main(String[] args) {
        //exemplo
        Login login = new Login("usuario", "senha");
    }
    public String getUsuario() {
        return usuario;

    }
    public String getSenha() {
        return senha;
    }
}
