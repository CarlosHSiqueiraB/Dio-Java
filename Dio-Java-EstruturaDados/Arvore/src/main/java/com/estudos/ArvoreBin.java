package com.estudos;

//Usando conceitos de recursividade
public class ArvoreBin<T extends Comparable<T>> {

    private BinNo<T> raiz;

    public ArvoreBin() {
        this.raiz = null;
    }

    public void inserir(T conteudo) { //Transforma o primeiro novoNó em raiz(isso se minha arvore for null)
        BinNo<T> novoNo = new BinNo<>(conteudo);
        raiz = inserir(raiz, novoNo);
    }

    private BinNo<T> inserir(BinNo<T> atual, BinNo<T> novoNo) {
        if (atual == null) {//Quando minha árvore estiver vazia, já faço esse método_ e retorno um novo nó
            return novoNo;
        } else if (novoNo.getConteudo().compareTo(atual.getConteudo()) < 0) { //Se isso for menor, retorna -1, se for igual retorna 0, e se for maior, retorna 1
            atual.setNoEsq(inserir(atual.getNoEsq(), novoNo));
        } else {
            atual.setNoDir(inserir(atual.getNoDir(), novoNo));

        }
        return atual;
    }

    public void exibirInOrder() {
        System.out.println("\n Exibindo In Ordem");
        exibirInOrder(this.raiz);
    }

    private void exibirInOrder(BinNo<T> atual) {
        if (atual != null) {
            exibirInOrder(atual.getNoEsq());
            System.out.print(atual.getConteudo() + " , ");
            exibirInOrder(atual.getNoDir());
        }
    }

    public void exibirPosOrder() {
        System.out.println("\n Exibindo Pós Ordem");
        exibirPosOrder(this.raiz);
    }

    private void exibirPosOrder(BinNo<T> atual) {
        if (atual != null) {
            exibirPosOrder(atual.getNoEsq());
            exibirPosOrder(atual.getNoDir());//Diferente do InOrdem, o pós, a visitação tem que ser antes de exibir
            System.out.print(atual.getConteudo() + " , ");
        }
    }

    public void exibirPreOrder() {
        System.out.println("\n Exibindo Pré Ordem");
        exibirPreOrder(this.raiz);
    }

    private void exibirPreOrder(BinNo<T> atual) {
        if (atual != null) {
            System.out.print(atual.getConteudo() + " , ");
            exibirPreOrder(atual.getNoEsq());
            exibirPreOrder(atual.getNoDir());//Diferente do PosOrdem, o pre, a visitação tem que ser aṕos exibir
        }
    }

    public void remover(T conteudo) {
        try {
            BinNo<T> atual = this.raiz;
            BinNo<T> pai = null;
            BinNo<T> filho = null;
            BinNo<T> temp = null;

            while (atual != null && (atual.getConteudo().equals(conteudo))) {
                pai = atual;
                if (conteudo.compareTo(atual.getConteudo()) < 0) {
                    atual = atual.getNoEsq();
                } else {
                    atual = atual.getNoDir();
                }
            }

            if (atual == null) {//Ou cheguei em uma folha, ou a raiz é null
                System.out.println("Conteudo nao encontrado. Bloco Try");
            }

            if (pai == null) {
                if (atual.getNoDir() == null) {
                    this.raiz = atual.getNoEsq();
                } else if (atual.getNoEsq() == null) {
                    this.raiz = atual.getNoDir();
                } else {
                    for (temp = atual, filho = atual.getNoEsq();
                         filho.getNoDir() != null;
                         temp = filho, filho = filho.getNoEsq()) {

                        if (filho != atual.getNoEsq()) {
                            temp.setNoDir(filho.getNoEsq());
                            filho.setNoEsq(raiz.getNoEsq());
                        }
                    }
                    filho.setNoDir(raiz.getNoDir());
                    raiz = filho;
                }
            } else if (atual.getNoDir() == null) {
                if (pai.getNoEsq() == atual) {
                    pai.setNoEsq(atual.getNoEsq());
                } else {
                    pai.setNoDir(atual.getNoEsq());
                }
            } else if (atual.getNoEsq() == null) {
                if (pai.getNoEsq() == atual) {
                    pai.setNoEsq(atual.getNoDir());
                } else {
                    pai.setNoDir(atual.getNoDir());
                }
            } else {
                for (temp = atual, filho = atual.getNoEsq();
                     filho.getNoDir() != null;
                     temp = filho, filho = filho.getNoDir()

                ) {
                    if (filho != atual.getNoEsq()) {
                        temp.setNoDir(filho.getNoEsq());
                        filho.setNoEsq(atual.getNoEsq());
                    }
                    filho.setNoDir(atual.getNoDir());
                    if (pai.getNoDir() == atual) {
                        pai.setNoEsq(filho);
                    } else {
                        pai.setNoDir(filho);
                    }
                }
            }

        } catch (NullPointerException erro) {
            System.out.println("Conteudo nao encontrado. Bloco Catch");
        }
    }
}
