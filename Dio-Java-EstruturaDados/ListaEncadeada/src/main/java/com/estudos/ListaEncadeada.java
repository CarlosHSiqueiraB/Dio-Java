package com.estudos;

public class ListaEncadeada<T> {
    No<T> refEntrada;

    public ListaEncadeada() {
        this.refEntrada = null;
    }

    public void add(T conteudo) {
        No<T> novoNo = new No<>(conteudo);
        if (this.isEmpty()) { //Se essa lista estiver vazia, minha ref de entrada agora vira o novo nó
            refEntrada = novoNo;
            return;
        }
        No<T> noAuxiliar = refEntrada;
        for (int i = 0; i < this.size() - 1; i++) {//Isso agora corre toda minha lista
            noAuxiliar = noAuxiliar.getProximoNo();//Quando ele chegar aqui, agora ele seta o Nó Auxiliar, como o novo Nó
        }
        noAuxiliar.setProximoNo(novoNo); //liga o novo nó ao ultimo
    }

    public T get(int index) { //Pega o valor do conteúdo do nó
        return getNo(index).getConteudo();
    }

    private No<T> getNo(int index) { //Pega o Nó
        validaIndice(index);
        No<T> noAuxiliar = refEntrada;
        No<T> noRetorno = null;

        for (int i = 0; i <= index; i++) {
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;
    }

    public T remove(int index) {//Função para remover o nó

        No<T> noAlvo = this.getNo(index);//Aqui eu puxo o nó usando o getNó, atribuindo a noAlvo
        if (index == 0) {//Caso receba valor 0, eu entro nesse if e retorno o noAlvo
            refEntrada = noAlvo.getProximoNo(); //Agora faço a referência de entrada, que era o primeiro nó da lista, virar o segundo nó
            return noAlvo.getConteudo();
        }

        No<T> noAnterior = getNo(index - 1); //Caso tenha algum problema, como o menor índice que posso receber é um, recebo o valor do primeiro nó sem problemas
        noAnterior.setProximoNo(noAlvo.getProximoNo());//Eu pego o nó anterior, e falo que o próximo nó, e o nó na frente dele
        return noAlvo.getConteudo(); //Assim deleto o valor do nó alvo
    }

    public int size() {
        int tamanhoLista = 0;
        No<T> refAux = refEntrada;
        while (true) {
            if (refAux != null) {
                tamanhoLista++; //Aqui posso incrementar 1 tamanho na lista, pois já garanti que tenho 1 elemento
                if (refAux.getProximoNo() != null) {//Se essa refAuxiliar for diferente de null, então tem nó a frente
                    refAux = refAux.getProximoNo();
                } else {
                    break;
                }
            }
        }
        return tamanhoLista;
    }

    private void validaIndice(int index) {//Valida o índice, para caso exista um grande índice, que iria dar erro no código
        if (index >= size()) {
            int ultimoIndice = size() - 1;
            throw new IndexOutOfBoundsException("Não existe counteúdo no ínice " + index + " desta lista, só vai até o índice " + ultimoIndice);
        }
    }

    public boolean isEmpty() {//Recebe o método_ de entrada, caso não tenha(null), então é false
        return refEntrada == null ? true : false;
    }

    public String toString() {
        String strRetorno = "";
        No<T> noAuxiliar = refEntrada;
        for (int i = 0; i < this.size(); i++) {//logica pra correr a lista
            strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() + "}]--->";
            noAuxiliar = noAuxiliar.getProximoNo();//pega o nó na frente dele
        }
        strRetorno += "null";
        return strRetorno;
    }
}
