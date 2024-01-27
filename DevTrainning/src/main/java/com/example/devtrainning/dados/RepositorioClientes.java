package com.example.devtrainning.dados;

import com.example.devtrainning.entidades.Avaliacao;
import com.example.devtrainning.entidades.Cliente;

public class RepositorioClientes {
    private Cliente[] clientes;
    private int proxima;
    public RepositorioClientes(int tamanho) {
        this.clientes = new Cliente[tamanho];
        this.proxima = 0;
    }

    public void cadastrar(Cliente c) {
        this.clientes[this.proxima] = c;
        this.proxima = this.proxima + 1;
    }

    public Cliente procurar(String num) {
        int i = 0;
        boolean achou = false;
        while ((!achou) && (i < this.proxima)) {
            if (num.equals(this.clientes[i].getCpf())) {
                achou = true;
            } else {
                i = i + 1;
            }
        }
        Cliente resultado = null;
        if (i != this.proxima) {
            resultado = this.clientes[i];
        }
        return resultado;
    }
    public void remover(String num) {
        int i = 0;
        boolean achou = false;
        while ((!achou) && (i < this.proxima)) {
            if (num.equals(this.clientes[i].getCpf())) {
                achou = true;
            } else {
                i = i + 1;
            }
        }
        if (i != this.proxima) {
            this.clientes[i] = this.clientes[this.proxima - 1];
            this.clientes[this.proxima - 1] = null;
            this.proxima = this.proxima - 1;
            System.out.println("Cliente " + num + " removido com sucesso.");
        } else {
            System.out.println("Cliente não existe.");
        }
    }

}
