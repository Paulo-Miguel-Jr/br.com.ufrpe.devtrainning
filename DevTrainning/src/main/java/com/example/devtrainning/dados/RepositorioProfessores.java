package com.example.devtrainning.dados;

import com.example.devtrainning.entidades.Avaliacao;
import com.example.devtrainning.entidades.Professor;


public class RepositorioProfessores {
    private Professor[] professor;
    private int proxima;
    public RepositorioProfessores(int tamanho) {
        this.professor = new Professor[tamanho];
        this.proxima = 0;
    }
    //Método para cadastrar
    public void cadastrar(Professor usuario) {
        this.professor[this.proxima] = usuario;
        this.proxima = this.proxima ++;
    }

    //Método para buscar
    public Professor buscar(String id_funcionario) {//talvez seja String e não do tipo int
        int i = 0;
        boolean achou = false;
        while ((!achou) && (i < this.proxima)) {
            if (id_funcionario.equals(this.professor[i].getCodigoDeFuncionario())) // mesmo problema do anterior
            {
                achou = true;
            } else {
                i = i + 1;
            }
        }
        Professor resultado = null;
        if (i != this.proxima) {
            resultado = this.professor[i];
        }
        return resultado;
    }

    //Método para remover
    public void remover(String id_funcionario) 	 {
        int i = 0;
        boolean achou = false;
        while ((!achou) && (i < this.proxima)) {// talvez devemos trocar o equal por ==
            if (id_funcionario.equals(this.professor[i].getCodigoDeFuncionario())) {
                achou = true;
            } else {
                i = i + 1;
            }
        }
        if (i != this.proxima) {
            this.professor[i] = this.professor[this.proxima - 1];
            this.professor[this.proxima - 1] = null;
            this.proxima = this.proxima - 1;
            System.out.println("Avaliação " + id_funcionario + " removida com sucesso.");//retirar mais tarde
        } else {
            System.out.println("Avaliação não existe.");//retirar mais tarde
        }
    }


    // Método para alterar as informações de um professor
    public void alterar(String id_funcionario, Professor novoProfessor) {
        int i = 0;
        boolean achou = false;

        // Procura o professor com o ID fornecido
        while ((!achou) && (i < this.proxima)) {
            if (id_funcionario.equals(this.professor[i].getCodigoDeFuncionario())) {// talvez mudar o equals por ==
                achou = true;
            } else {
                i = i + 1;
            }
        }

        // Se encontrou o professor, realiza a alteração
        if (achou) {
            this.professor[i] = novoProfessor;
            System.out.println("Professor " + id_funcionario + " alterado com sucesso.");//remover mais tarde
        } else {
            System.out.println("Professor não encontrado.");//remover mais tarde
        }
    }

}
// tem que mudar o getCodigoDeFuncionario por id_funcionario
