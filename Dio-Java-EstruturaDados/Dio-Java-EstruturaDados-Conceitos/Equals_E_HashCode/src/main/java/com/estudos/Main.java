package com.estudos;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carro> ListaCarros = new ArrayList<>();

        ListaCarros.add(new Carro("Ford"));
        ListaCarros.add(new Carro("Volvo"));
        ListaCarros.add(new Carro("Toyota"));

        System.out.println(ListaCarros.contains(new Carro("Ford")));
        System.out.println(ListaCarros.contains(new Carro("FordKa")));
        System.out.println(new Carro("Ford").hashCode());
    }
}