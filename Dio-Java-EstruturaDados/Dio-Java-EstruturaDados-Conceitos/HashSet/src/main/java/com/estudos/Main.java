package com.estudos;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Carro> hashSetCarros = new HashSet<>();

        hashSetCarros.add(new Carro("Tesla"));
        hashSetCarros.add(new Carro("Toyota"));
        hashSetCarros.add(new Carro("Porsche"));
        hashSetCarros.add(new Carro("Ford"));
        hashSetCarros.add(new Carro("Gurgel"));
        hashSetCarros.add(new Carro("Zeekr"));

        System.out.println(hashSetCarros);

        Set<Carro> treeSetCarros = new TreeSet<>(); //Igualzinho a estrutura de arvore dos códigos passados, a classe carro deve ter o complements TO

        treeSetCarros.add(new Carro("Tesla"));
        treeSetCarros.add(new Carro("Toyota"));
        treeSetCarros.add(new Carro("Porsche"));
        treeSetCarros.add(new Carro("Ford"));
        treeSetCarros.add(new Carro("Gurgel"));
        treeSetCarros.add(new Carro("Zeekr"));

        System.out.println(treeSetCarros);
    }
}
