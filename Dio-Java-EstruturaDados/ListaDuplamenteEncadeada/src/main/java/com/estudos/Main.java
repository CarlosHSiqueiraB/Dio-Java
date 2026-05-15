package com.estudos;

public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada<String> minhaLista_D_Encadeada = new ListaDuplamenteEncadeada<>();

        minhaLista_D_Encadeada.add("C1");
        minhaLista_D_Encadeada.add("C2");
        minhaLista_D_Encadeada.add("C3");
        minhaLista_D_Encadeada.add("C4");
        minhaLista_D_Encadeada.add("C5");
        minhaLista_D_Encadeada.add("C6");
        minhaLista_D_Encadeada.add("C7");

        System.out.println(minhaLista_D_Encadeada);

        minhaLista_D_Encadeada.remove(6);
        System.out.println(minhaLista_D_Encadeada);
        minhaLista_D_Encadeada.add(6,"99");
        System.out.println(minhaLista_D_Encadeada);


    }
}