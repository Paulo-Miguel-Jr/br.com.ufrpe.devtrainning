package com.example.devtrainning.entidades;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Medidas implements Serializable {
    private Cliente cliente;
    private double peso;
    private double altura;
    private double imc; // Índice de Massa Corporal
    private double bracoE;
    private double bracoD;
    private double peitoral;
    private double barriga;
    private double quadril;
    private double coxaE;
    private double coxaD;
    private double panturrilhaE;
    private double panturrilhaD;
    private LocalDate dataRegistro;

    public Medidas(Cliente cliente, double peso, double altura, double bracoE, double bracoD, double peitoral, double barriga,
                   double quadril, double coxaE, double coxaD, double panturrilhaE, double panturrilhaD, LocalDate dataRegistro) {
        this.cliente = getCliente();
        this.peso = peso;
        this.altura = altura;
        this.bracoE = bracoE;
        this.bracoD = bracoD;
        this.peitoral = peitoral;
        this.barriga = barriga;
        this.quadril = quadril;
        this.coxaE = coxaE;
        this.coxaD = coxaD;
        this.panturrilhaE = panturrilhaE;
        this.panturrilhaD = panturrilhaD;
        this.dataRegistro = dataRegistro;
        calcularIMC();
    }
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public double getIMC() {
        return imc;
    }

    public double getBracoE() {
        return bracoE;
    }

    public double getBracoD() {
        return bracoD;
    }

    public double getPeitoral() {
        return peitoral;
    }

    public double getBarriga() {
        return barriga;
    }

    public double getQuadril() {
        return quadril;
    }

    public double getCoxaE() {
        return coxaE;
    }

    public double getCoxaD() {
        return coxaD;
    }

    public double getPanturrilhaE() {
        return panturrilhaE;
    }

    public double getPanturrilhaD() {
        return panturrilhaD;
    }

    public String getDataRegistro() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return dataRegistro.format(formatter);
    }

    private void calcularIMC() {
        this.imc = peso / (altura * altura);
    }

    @Override
    public String toString() {
        return "Medidas{" +
                "Cliente=" + cliente +
                ",peso=" + peso +
                ", altura=" + altura +
                ", imc=" + imc +
                ", bracoE=" + bracoE +
                ", bracoD=" + bracoD +
                ", peitoral=" + peitoral +
                ", barriga=" + barriga +
                ", quadril=" + quadril +
                ", coxaE=" + coxaE +
                ", coxaD=" + coxaD +
                ", panturrilhaE=" + panturrilhaE +
                ", panturrilhaD=" + panturrilhaD +
                ", dataRegistro=" + dataRegistro +
                '}';
    }
}