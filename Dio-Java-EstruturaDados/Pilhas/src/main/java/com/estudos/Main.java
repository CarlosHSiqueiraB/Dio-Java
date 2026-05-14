package com.estudos;

//Feita utilizando método_ utilizando refência e memória, saiando do método_ estático
public class Main {
    public static void main(String[] args) {

        Pilha minhaPilha = new Pilha();

        minhaPilha.push(new No(1)); //Minha pilha não aceita valores direto, então tenho que criar um nó dentro dela para eles receberem os valores dos dados!
        minhaPilha.push(new No(2));
        minhaPilha.push(new No(3));
        minhaPilha.push(new No(4));
        minhaPilha.push(new No(5));

        System.out.println(minhaPilha);

        minhaPilha.pop();
        System.out.println(minhaPilha);



    }
}