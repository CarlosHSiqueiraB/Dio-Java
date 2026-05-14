package com.estudos;


public class Main {
    public static void main(String[] args) {
        //Quando java trabalha com tipos primitivos, ele copia exatamente o VALOR da variável.
        int A = 1;
        int B = A;

        System.out.println("IntA= "+A+" IntB= "+B);
        A = 2;
        System.out.println("IntA= "+A+" IntB= "+B);

        //Quando java trabalha com objetos, ele copia a referência de memória do objeto
        MeuObj objA = new MeuObj(1 );
        MeuObj objB = objA;

        System.out.println("IntA= "+objA+" IntB= "+objB);
        objA.setNum(2);
        System.out.println("IntA= "+objA+" IntB= "+objB);
    }
}