package com.estudos;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Processo Seletivo");
        String [] candidatos = {"Ronaldo","Lucas","Ronald","Constantino","Ramon","Hector","Carlos","Donatelo"};
        for(String candidato: candidatos){
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu=false;
        do{
            atendeu= atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativasRealizadas++;
        }while (continuarTentando && tentativasRealizadas<3);

        if(atendeu)
            System.out.println("Conguimos contato com candidato "+ candidato+" na tentativa "+tentativasRealizadas);
        else
            System.out.println("Não conseguimos contato com "+candidato);
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"Ronaldo","Lucas","Ronald","Constantino","Ramon","Hector","Carlos","Donatelo"};
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase =2000.0;
        while(candidatosSelecionados<5 && candidatosAtual< candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido=valorPretendido();

            System.out.println("O candidato "+candidato+" Solicitou este valor de salário "+ salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O Candidato "+candidato+" Foi selecionado para a vaga!");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }

    }

    static void imprimirSelecionador(){
        String [] candidatos = {"Ronaldo","Lucas","Ronald","Constantino","Ramon","Hector","Carlos","Donatelo"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
        for(int indice = 0; indice<candidatos.length;indice++){
            System.out.println("O Candidato de Nº "+ (indice+1)+" é "+candidatos[indice]);

        }
    }



    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void analisarCandidato(double salairioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salairioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salairioPretendido){
            System.out.println("Ligar para o candidato com contra proposta");
        } else{
            System.out.println("Aguardando resultado dos restante dos candidatos");
        }
    }
}