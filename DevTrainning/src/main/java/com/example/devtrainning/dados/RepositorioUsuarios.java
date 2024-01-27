package com.example.devtrainning.dados;

import com.example.devtrainning.entidades.Usuario;

public class RepositorioUsuarios {
    private Usuario[] usuariosRepositorio;
    private int proxima;
    public RepositorioUsuarios(int tamanho) {
        this.usuariosRepositorio = new Usuario[tamanho];
        this.proxima = 0;
    }

    //cadastrar

    public void cadastrar(Usuario usuario) {
        this.usuariosRepositorio[this.proxima] = usuario;
        this.proxima = this.proxima + 1;
    }
    //buscar por idUsario

    public Usuario buscar(String idUsuario) {//talvez seja String e não do tipo int
        int i = 0;
        boolean achou = false;
        while ((!achou) && (i < this.proxima)) {// talvez devemos trocar o equals por ==
            if (idUsuario.equals(this.usuariosRepositorio[i].getId_usuariosRepositorio())) {
                achou = true;
            } else {
                i = i + 1;
            }
        }
        Usuario resultado = null;
        if (i != this.proxima) {
            resultado = this.usuariosRepositorio[i];
        }
        return resultado;
    }


    //remover
    public void remover(String idUsuario) {
        int i = 0;
        boolean achou = false;
        while ((!achou) && (i < this.proxima)) {
            if (idUsuario.equals(this.usuariosRepositorio[i].getId_usuariosRepositorio())) {// mesmo problema do anterior
                achou = true;
            } else {
                i = i + 1;
            }
        }
        if (i != this.proxima) {
            this.usuariosRepositorio[i] = this.usuariosRepositorio[this.proxima - 1];
            this.usuariosRepositorio[this.proxima - 1] = null;
            this.proxima = this.proxima - 1;
            System.out.println("Avaliação " + idUsuario + " removida com sucesso.");//editar
        } else {
            System.out.println("Avaliação não existe.");
        }
    }
    //alterar
    public void alterar(String idUsario, Usuario novoUsuario){
        int i = 0;
        boolean achou = false;

        // Procura o professor com o ID fornecido
        while ((!achou) && (i < this.proxima)) {
            if (idUsario.equals(this.usuariosRepositorio[i].getId_usuariosRepositorio())) {
                achou = true;
            } else {
                i = i + 1;
            }
        }

        // Se encontrou o Usuário, realiza a alteração
        if (achou) {
            this.usuariosRepositorio[i] = novoUsuario;
            System.out.println("Professor " + idUsario + " alterado com sucesso.");//remover mais tarde
        } else {
            System.out.println("Professor não encontrado.");//remover mais tarde
        }

    }

}

