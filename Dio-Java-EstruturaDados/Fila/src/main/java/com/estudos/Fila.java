package com.estudos;

public class Fila {
    private No refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null;
    }

    public void enqueue(No novoNo) {//Novo nó entra na fila
        novoNo.setRefNo(refNoEntradaFila);//Agora que novo nó entrou na fila, a Antiga ref de entrada, agora não é mais a ultima da fila, é a penultima
        refNoEntradaFila = novoNo; //Agora a ref de entrada aponta pro novo nó
    }

    public No first() {
        if (!this.isEmpty()) {//Se só há um nó na fila, então ele sempre será o primeiro nó
            No primeiroNo = refNoEntradaFila;
            while (true) {
                if (primeiroNo.getRefNo() != null) { //Como eu sei que ele tem que passar os nós de alguma forma, eu faço isso:
                    primeiroNo = primeiroNo.getRefNo(); //Agora meu primeiro nó, passa a ser o nó na frente dele
                } else {
                    break;
                }
            }
            return primeiroNo;
        }
        return null;
    }

    public No dequeue() {
        if (!this.isEmpty()) {//Se só há um nó na fila, então ele sempre será o primeiro nó
            No primeiroNo = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila;
            while (true) {
                if (primeiroNo.getRefNo() != null) {
                    noAuxiliar = primeiroNo; //Agora antes de meu primeiro nó passar a ser o próximo nó, eu ainda tenho guardado meu nó anterior
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    noAuxiliar.setRefNo(null); //Agora eu faço meu 2° nó ser o primeiro da lista
                    break;
                }
            }
            return primeiroNo;
        }
        return null;
    }

    //Teste lógico para verificar fila vazia
    public boolean isEmpty() {
        return refNoEntradaFila == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No noAuxiliar = refNoEntradaFila;

        if (refNoEntradaFila != null) { //se minha fila tiver objetos, então
            while (true) {
                stringRetorno += "[No{objeto=" + noAuxiliar.getObject() + "}] --->";
                if (noAuxiliar.getRefNo() != null) {
                    noAuxiliar = noAuxiliar.getRefNo();//Passando para o próximo nó
                } else {
                    stringRetorno += "null";
                    break;
                }
            }
        } else {
            stringRetorno = "null";
        }
        return stringRetorno;
    }
}
