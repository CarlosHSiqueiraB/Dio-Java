package com.estudos;

public class Main {
    public static void main(String[] args) {
        Cozinheiro robson = new Cozinheiro();
        Garconete loiane = new Garconete();

        robson.setId(1);
        robson.chamar();

        loiane.setId(1);
        loiane.chamar();
    }
}