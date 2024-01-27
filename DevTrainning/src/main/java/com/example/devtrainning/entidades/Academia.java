package com.example.devtrainning.entidades;

import com.example.devtrainning.dados.RepositorioMedidas;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Academia {
    public static void main(String[] args) {
        // Criando um objeto de medição
        Professor professor1 = new Professor(1, "Wendell", "874243252", "wendell.stronda@email.com",
                "515141414", "Rua do Professor", 30, "Manhã", 5000.0);
        LocalDate dataMatricula = LocalDate.of(2023, 1, 15); // Exemplo de data de matrícula
        Cliente cliente1 = new Cliente(1, "Cliente Teste", "423423456", "cliente@email.com", "898444111-89",
                "Rua robertinho", 32, "treino", dataMatricula, professor1, true);

        // Criando uma lista de medidas e adicionando medidas do cliente 1
        List<Medidas> medidasList = new ArrayList<>();
        medidasList.add(cliente1);

        // Criando um repositório de medidas e salvando as medidas
        RepositorioMedidas repository = new RepositorioMedidas("medidas.dat");
        repository.salvarMedidas(medidasList);

        // Carregando as medidas do arquivo
        List<Medidas> medidasCarregadas = repository.carregarMedidas();

        // Exibindo as medidas carregadas
        for (Medidas medidas : medidasCarregadas) {
            System.out.println("Medidas carregadas:");
            System.out.println("Peso: " + medidas.getPeso() + " kg");
            System.out.println("Altura: " + medidas.getAltura() + " m");
            System.out.println("IMC: " + medidas.getIMC());
            System.out.println("Braço Esquerdo: " + medidas.getBracoE() + " cm");
            System.out.println("Braço Direito: " + medidas.getBracoD() + " cm");
            System.out.println("Peitoral: " + medidas.getPeitoral() + " cm");
            System.out.println("Barriga: " + medidas.getBarriga() + " cm");
            System.out.println("Quadril: " + medidas.getQuadril() + " cm");
            System.out.println("Coxa Esquerda: " + medidas.getCoxaE() + " cm");
            System.out.println("Coxa Direita: " + medidas.getCoxaD() + " cm");
            System.out.println("Panturrilha Esquerda: " + medidas.getPanturrilhaE() + " cm");
            System.out.println("Panturrilha Direita: " + medidas.getPanturrilhaD() + " cm");
            System.out.println("Data de Registro: " + medidas.getDataRegistro());
        }
    }
}
