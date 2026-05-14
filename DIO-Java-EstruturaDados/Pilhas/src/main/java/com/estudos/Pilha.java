package com.estudos;

public class Pilha {
    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    //Acrescenta um novo nó ao topo da pilha
    public void push(No novoNo) {
        No refAuxiliar = refNoEntradaPilha; //Guarda referência de entrada
        refNoEntradaPilha = novoNo; //Agr o novo nó e o novo obj na ref de entrada da pilha
        refNoEntradaPilha.setRefNo(refAuxiliar); //Isso refere que o nó em baixo dele, é minha antiga referência de topo
    }


    public No pop() {
        if (!this.isEmpty()) { //Verifica se minha pilha está vazia ou não
            No noPoped = refNoEntradaPilha; //Guarda o nó que eu estou retirano(poped/poppando)
            refNoEntradaPilha = refNoEntradaPilha.getRefNo(); //Agora falo que minha referência de entrada é o nó de baixo dele
            return noPoped;
        }
        return null;
    }

    //Metodo top, simplesmente retorna a referência
    public No top() {
        return refNoEntradaPilha;
    }

    //Se meu nó de referência de entrada estiver nulo, ele retorna true, se n, retorna false
    public boolean isEmpty() {
        if (refNoEntradaPilha == null) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String stringRetorno = "----------\n";
        stringRetorno += "    Pilha\n";
        stringRetorno += "----------\n";

        No noAuxiliar = refNoEntradaPilha;
        while (true) {
            if (noAuxiliar != null) {
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n"; //Esse é o nó de referencia de entrada(topo da pilha)
                noAuxiliar = noAuxiliar.getRefNo(); //Agora toda vez que ele rodar, ele vai imprimir o dado do nó abaixo do topo, e isso funciona por culpa que o break irá parar quando não tiver mais dados!
            } else {
                break;
            }
        }
        stringRetorno += "----------\n";
        return stringRetorno;
    }
}
