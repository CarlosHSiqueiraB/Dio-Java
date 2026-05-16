package com.estudos;

import java.util.Objects;

public class Carro {

    String marca;

    public Carro(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    //Aqui testo uma igualdade de atributos, que no caso é de marca, ele recebe o valor e compara na memória para descobrir se há algum igual
    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Carro carro = (Carro) object;
        return Objects.equals(marca, carro.marca);
    }

    //Retorna um Hash do atributo marca
    @Override
    public int hashCode() {
        return Objects.hashCode(marca);
    }
}
