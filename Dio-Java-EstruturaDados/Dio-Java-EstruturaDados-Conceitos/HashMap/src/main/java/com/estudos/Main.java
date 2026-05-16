package com.estudos;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> aluno = new HashMap<>();

        aluno.put("Nome","João");
        aluno.put("Idade","16");
        aluno.put("Média","7.7");
        aluno.put("Turma","1A");

        System.out.println(aluno);
        System.out.println(aluno.keySet());
        System.out.println(aluno.values());

        List<Map<String, String>> ListaAlunos = new ArrayList<>();
        ListaAlunos.add(aluno);

        Map<String, String> aluno2 = new HashMap<>();

        aluno2.put("Nome","Maria");
        aluno2.put("Idade","15");
        aluno2.put("Média","8");
        aluno2.put("Turma","1A");
        ListaAlunos.add(aluno2);

        System.out.println(ListaAlunos);

        System.out.println(aluno.containsKey("Nome"));
    }
}
