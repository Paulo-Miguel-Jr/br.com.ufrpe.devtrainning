package com.example.devtrainning.entidades;

import java.text.DecimalFormat;

public class Avaliacao {
    private Medidas medidas;
    private String observacoes;

    public Avaliacao(Medidas medidas, String observacoes) {
        this.medidas = medidas;
        this.observacoes = observacoes;
    }

    public Medidas getMedidas() {
        return medidas;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public String classificarIMC() {
        double imc = medidas.getIMC();
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 24.9) {
            return "Peso normal";
        } else if (imc < 29.9) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }

    public String recomendarExercicios() {
        double imc = medidas.getIMC();
        if (imc < 18.5) {
            return "Recomenda-se um programa de ganho de peso com treinamento de resistência.";
        } else if (imc < 24.9) {
            return "Recomenda-se manter uma rotina de exercícios regulares para manter o peso saudável.";
        } else if (imc < 29.9) {
            return "Recomenda-se um programa de perda de peso com exercícios aeróbicos e dieta balanceada.";
        } else {
            return "Recomenda-se uma consulta com um profissional de saúde para elaborar um plano de perda de peso seguro.";
        }
    }

    public String formatarIMC() {
        double imc = medidas.getIMC();
        DecimalFormat df = new DecimalFormat("#.##");
        return df.format(imc);
    }
}

