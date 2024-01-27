package com.example.devtrainning.entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Cliente extends Pessoa {


    private String treino;
    private LocalDate dataMatricula;
    private Professor professor;
    private boolean statusMatricula;

    public Cliente() {

    }

    public Cliente(long id, String nome, String telefone, String email, String cpf, String endereco, int idade,
                   String treino, LocalDate dataMatricula, Professor professor, Boolean statusMatricula) {
        super(id, nome, telefone, email, cpf, endereco, idade);
        this.treino = treino;
        this.dataMatricula = dataMatricula;
        this.professor = professor;
        this.statusMatricula = statusMatricula;
    }


    public String getTreino() {
        return treino;
    }

    public void setTreino(String treino) {
        this.treino = treino;
    }

    public String getDataMatricula() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return dataMatricula.format(formatter);
    }

    public void setDataMatricula(LocalDate dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getProfessor() {
        return professor.getNome();
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Boolean getStatusMatricula() {
        return statusMatricula;
    }
    public void setStatusMatricula(Boolean statusMatricula) {
        this.statusMatricula = statusMatricula;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + Objects.hash(dataMatricula, professor, statusMatricula, treino);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cliente other = (Cliente) obj;
        return Objects.equals(dataMatricula, other.dataMatricula) && Objects.equals(professor, other.professor)
                && statusMatricula == other.statusMatricula && Objects.equals(treino, other.treino);
    }

    @Override
    public String toString() {
        return "Cliente [treino=" + treino + ", dataMatricula=" + dataMatricula + ", professor=" + professor
                + ", statusMatricula=" + statusMatricula + "]";
    }


}