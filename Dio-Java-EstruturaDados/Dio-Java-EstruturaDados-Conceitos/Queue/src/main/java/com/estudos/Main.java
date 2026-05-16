package com.estudos;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Carro> queueCarros = new LinkedList<>();

        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Jeep"));
        queueCarros.add(new Carro("Ferrari"));

        System.out.println(queueCarros.add(new Carro("Peugeout")));
        System.out.println(queueCarros);


        System.out.println(queueCarros.offer(new Carro("Renegade")));//Caso o offer não consiga adicionar, ele retorna false
        System.out.println(queueCarros);

        System.out.println(queueCarros.poll());
        System.out.println(queueCarros);

        System.out.println(queueCarros.size());

    }
}