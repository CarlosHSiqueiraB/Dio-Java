package com.estudos;

public class Main {
    public static void main(String[] args) {
        ListaCircular<String> minhaListaCircular = new ListaCircular<>();

        minhaListaCircular.add("C0");
        System.out.println(minhaListaCircular);

        minhaListaCircular.remove(0);
        System.out.println(minhaListaCircular);

        minhaListaCircular.add("C0");
        minhaListaCircular.add("C1");
        minhaListaCircular.add("C2");
        minhaListaCircular.add("C3");
        System.out.println(minhaListaCircular);
    }
}