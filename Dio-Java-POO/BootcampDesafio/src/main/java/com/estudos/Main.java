package com.estudos;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Mentoria mentoria1 = new Mentoria();


        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso de java da DIO");
        curso1.setCargaH(8);
//        System.out.println(curso1);

        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Pela professora Camila");
        mentoria1.setData(LocalDate.now());
//        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        Dev Lucas = new Dev();
        Dev Carlos = new Dev();

        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria1);

        Lucas.setNome("Lucas");
        Lucas.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos incritos" + Lucas.getConteudoInscritos());
        System.out.println("Conteúdos Concluidos" + Lucas.getConteudoConcluidos());
        System.out.println("XP" + Lucas.calcularXp());

        System.out.printf("===============\n");

        Carlos.setNome("Carlos");
        Carlos.inscreverBootcamp(bootcamp);
        Carlos.progredir();
        Carlos.progredir();
        System.out.println("Conteúdos incritos" + Carlos.getConteudoInscritos());
        System.out.println("Conteúdos Concluidos" + Carlos.getConteudoConcluidos());
        System.out.println("XP" + Carlos.calcularXp());

    }
}