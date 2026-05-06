package com.estudos;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello World");
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();

        cc.depositar(100);
        cc.transferir(43, cp);
        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}