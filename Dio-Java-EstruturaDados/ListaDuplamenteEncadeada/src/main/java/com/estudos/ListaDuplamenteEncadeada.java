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

    public void add(int index, T elemento) {
        NoDuplo<T> noAux = getNo(index);//Caso o indice seja 0, aqui ja temos o primeiro nó
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setNoProximo(noAux);

        if (novoNo.getNoProximo() != null) {
            novoNo.setNoPrevio(noAux.getNoPrevio());//Faço o nó prévio virar o novoNo
            novoNo.getNoProximo().setNoPrevio(novoNo);//E aqui faço o antigo nó prévio virar o novo próximo nó
        } else {
            novoNo.setNoPrevio(ultimoNo);
            ultimoNo = novoNo; //Aqui transformo o ultimo nó da lista no novoNo
        }

        if (index == 0) {
            primeiroNo = novoNo;
        } else {
            novoNo.getNoPrevio().setNoProximo(novoNo);
        }

        tamanhoLista++;
    }

    public void remove(int index) {
        if (index == 0) {
            primeiroNo = primeiroNo.getNoProximo();//Agora minha referência de primeiro nó, passa a apontar pro segundo
            if (primeiroNo != null) {
                primeiroNo.setNoPrevio(null);
            }
        } else {
            NoDuplo<T> noAux = getNo(index);//Aqui simplesmente recebo o valor do index
            noAux.getNoPrevio().setNoProximo(noAux.getNoProximo());//Para transformar o nó prévio no próximo nó
            if (noAux != ultimoNo) {
                noAux.getNoProximo().setNoPrevio(noAux.getNoPrevio());//Aqui eu tiro a conexão do nó prévio do index escolhido, e passo para o nó prévio dele, tipo escolher o index 3, isso vai fazer o index 2 -> 1 e o 1 -> 0
            } else {
                ultimoNo = noAux.getNoPrevio();
            }
        }
        this.tamanhoLista--;
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

    @Override
    public String toString() {
        String strRetorno = "";
        NoDuplo<T> noAux = primeiroNo;
        for (int i = 0; i < size(); i++) {
            strRetorno += "{No[conteudo=" + noAux + "]} ->";
            noAux = noAux.getNoProximo();
        }
        strRetorno += "null";
        return strRetorno;
    }
}
