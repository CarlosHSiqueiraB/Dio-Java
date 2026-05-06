package com.estudos;

import javax.sound.midi.Sequence;

public class ContaCorrente extends Conta{

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato Conta Corrente");
        ImprimirInfosSimples();
    }
}
