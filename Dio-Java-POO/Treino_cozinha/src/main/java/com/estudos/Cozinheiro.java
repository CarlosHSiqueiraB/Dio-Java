package com.estudos;

public class Cozinheiro extends Funcionario {
    //Encapsulamento
    public void chamar() {
        verificarPedido();
        System.out.println("O Cozinheiro foi chamado");
    }

    private void verificarPedido() {
        System.out.println("Verifica se há algum pedido");
    }
}