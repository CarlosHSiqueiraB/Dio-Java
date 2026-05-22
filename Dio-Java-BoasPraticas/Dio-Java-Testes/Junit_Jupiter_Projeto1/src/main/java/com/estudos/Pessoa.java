package com.estudos;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {
    private String nome;
    private LocalDate data;

    public Pessoa(String nome, LocalDate data) {
        this.nome = nome;
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getData() {
        return data;
    }

    public int getIdade() {
        return (int) ChronoUnit.YEARS.between(this.data, LocalDate.now());
    }

    public boolean eMaiorIdade(){
        return getIdade()>=18;
    }

}
