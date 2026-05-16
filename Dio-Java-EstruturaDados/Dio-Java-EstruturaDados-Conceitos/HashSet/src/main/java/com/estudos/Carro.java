package com.estudos;

import java.util.Objects;

public class Carro implements Comparable<Carro> {

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

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                '}';
    }

    //    @Override //metodo por tamanho(ele não imprime as opções que tiverem a mesma qtd de letras
//    public int compareTo(Carro carro) {
//        if (this.marca.length() < carro.marca.length()) {
//            return -1;
//        } else if (this.marca.length() > carro.marca.length()) {
//            return 1;
//        }
//        return 0;


    @Override // Impressão de A-Z
    public int compareTo(Carro carro) {
        return this.getMarca().compareTo(carro.getMarca());
    }


}
