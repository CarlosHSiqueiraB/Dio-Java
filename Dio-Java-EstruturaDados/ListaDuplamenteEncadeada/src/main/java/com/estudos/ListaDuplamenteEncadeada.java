package com.estudos;

public class ListaDuplamenteEncadeada<T> {
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;

    private int tamanhoLista;

    public ListaDuplamenteEncadeada() {
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanhoLista = 0;
    }

    public T get(int index) {
        return this.getNo(index).getConteudo();
    }

    //Método_ add que adiciona ao final da lista
    public void add(T elemento) {
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);//Agora estou criando um elemento pra lista
        novoNo.setNoProximo(null);//Agora faço o próximo nó, ser nulo, pois ele fica no final da lista
        novoNo.setNoPrevio(ultimoNo);//Agora esse nó prévio, aponta pro antigo ultimo nó da lista
        if (primeiroNo == null) {
            primeiroNo = novoNo;
        }
        if (ultimoNo != null) {
            ultimoNo.setNoProximo(novoNo);//Fazendo o antigo ultimo nó, ser o novo nó
        }
        ultimoNo = novoNo;
        tamanhoLista++;
    }

    private NoDuplo<T> getNo(int index) {//Como agora a estrutura é um pouco diferente, também mudamos um pouco a forma do get nó
        NoDuplo<T> noAux = primeiroNo;//Eu começo pelo primeiro nó da lista
        for (int i = 0; (i < index) && (noAux != null); i++) {
            noAux = noAux.getNoProximo();
        }
        return noAux;
    }


    public int size() {
        return tamanhoLista;
    }


}
