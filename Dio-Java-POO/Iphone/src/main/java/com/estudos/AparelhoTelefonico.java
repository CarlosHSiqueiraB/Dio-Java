package com.estudos;

public class AparelhoTelefonico {
    private String numero;

    public String getNumero(){
        return numero;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }

    public void ligar(String numero){
        System.out.println("Ligando para o número informado");
        atender();
        iniciarCorreioVoz();
    }

    public void atender(){
        System.out.println("Atendendo o telefone");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Iniciando Correio de voz");
    }
}
