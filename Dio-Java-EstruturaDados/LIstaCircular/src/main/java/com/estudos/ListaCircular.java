package com.estudos;

public class ListaCircular<T> {
    private No<T> cabeca;
    private No<T> cauda;
    private int tamanhoLista;

    public ListaCircular() {
        this.cauda = null;
        this.cabeca = null;
        this.tamanhoLista = 0;
    }

    public void add(T conteudo) {
        No<T> novoNo = new No<>(conteudo);
        if (this.tamanhoLista == 0) {
            this.cabeca = novoNo;
            this.cauda = this.cabeca;
            this.cabeca.setNoProximo(cauda);
        } else {
            novoNo.setNoProximo(this.cauda);
            this.cabeca.setNoProximo(novoNo);
            this.cauda = novoNo;
        }
        this.tamanhoLista++;
    }

    public void remove(int index) {
        if (index >= this.tamanhoLista) {
            throw new IndexOutOfBoundsException("O índice é maior que o tamanho da lista");
        }
        No<T> noAux = this.cauda;

        if (index == 0) {
            this.cauda = this.cauda.getNoProximo();//A cauda deixa de ser a cauda e passa ser o próximo nó a frente dela
            this.cabeca.setNoProximo(this.cauda);
        } else if (index == 1) {
            this.cauda.setNoProximo(this.cauda.getNoProximo());
        } else {
            for (int i = 0; i < index - 1; i++) {
                noAux.setNoProximo(noAux.getNoProximo().getNoProximo());//Aqui eu faço o nó, pular e apontar pra outro nó na frente dele, é tipo 1->2 agora 1->3 e 2 não existe mais
            }
        }
        this.tamanhoLista--;
    }

    public T get(int index) {
        return this.getNo(index).getConteudo();
    }

    private No<T> getNo(int index) {
        if (this.isEmpty()) {
            throw new IndexOutOfBoundsException("A lista está vazia");
        }

        if (index == 0) {
            return this.cauda;
        }

        No<T> noAux = this.cauda;
        for (int i = 0; (i < index) && (noAux != null); i++) {
            noAux = noAux.getNoProximo();
        }
        return noAux;
    }

    public boolean isEmpty() {
        return this.tamanhoLista == 0 ? true : false;
    }

    public int sizer() {
        return this.tamanhoLista;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAux = this.cauda;
        for (int i = 0; i < this.sizer(); i++) {
            strRetorno += "{No[conteudo=" + noAux + "]}->";
            noAux = noAux.getNoProximo();
        }

        strRetorno += this.sizer() != 0 ? "(Retorna ao início)" : "[]";
        return strRetorno;
    }
}
