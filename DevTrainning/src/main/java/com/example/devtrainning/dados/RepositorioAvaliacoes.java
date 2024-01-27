package com.example.devtrainning.dados;

import com.example.devtrainning.entidades.Avaliacao;

public class RepositorioAvaliacoes {
    private Avaliacao[] avaliacoes;
    private int proxima;
    public RepositorioAvaliacoes(int tamanho) {
        this.avaliacoes = new Avaliacao[tamanho];
        this.proxima = 0;
    }

    public void cadastrar(Avaliacao c) {
        this.avaliacoes[this.proxima] = c;
        this.proxima = this.proxima + 1;
    }

    public Avaliacao procurar(String num) {
        int i = 0;
        boolean achou = false;
        while ((!achou) && (i < this.proxima)) {
            if (num.equals(this.avaliacoes[i].getId_avaliacao())) {
                achou = true;
            } else {
                i = i + 1;
            }
        }
        Avaliacao resultado = null;
        if (i != this.proxima) {
            resultado = this.avaliacoes[i];
        }
        return resultado;
    }
    public void remover(String num) {
        int i = 0;
        boolean achou = false;
        while ((!achou) && (i < this.proxima)) {
            if (num.equals(this.avaliacoes[i].getId_avaliacao())) {
                achou = true;
            } else {
                i = i + 1;
            }
        }
        if (i != this.proxima) {
            this.avaliacoes[i] = this.avaliacoes[this.proxima - 1];
            this.avaliacoes[this.proxima - 1] = null;
            this.proxima = this.proxima - 1;
            System.out.println("Avaliação " + num + " removida com sucesso.");
        } else {
            System.out.println("Avaliação não existe.");
        }
    }

}