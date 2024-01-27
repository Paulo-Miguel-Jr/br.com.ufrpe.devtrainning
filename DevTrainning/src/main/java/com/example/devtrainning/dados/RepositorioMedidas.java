package com.example.devtrainning.dados;

import com.example.devtrainning.entidades.Medidas;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


// Classe para representar o repositório de medidas
public class RepositorioMedidas {
    private String filename;

    public RepositorioMedidas(String filename) {
        this.filename = filename;
    }

    // Método para salvar medidas em um arquivo
    public void salvarMedidas(List<Medidas> medidasList) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filename))) {
            outputStream.writeObject(medidasList);
            System.out.println("Medidas salvas com sucesso.");
        } catch (IOException e) {
            System.err.println("Erro ao salvar medidas: " + e.getMessage());
        }
    }

    // Método para carregar medidas de um arquivo
    public List<Medidas> carregarMedidas() {
        List<Medidas> medidasList = new ArrayList<>();
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filename))) {
            Object obj = inputStream.readObject();
            if (obj instanceof List) {
                medidasList = (List<Medidas>) obj;
                System.out.println("Medidas carregadas com sucesso.");
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Erro ao carregar medidas: " + e.getMessage());
        }
        return medidasList;
    }
}
