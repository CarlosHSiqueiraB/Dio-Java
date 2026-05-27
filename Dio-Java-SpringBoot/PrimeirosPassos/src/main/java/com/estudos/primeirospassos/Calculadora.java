package com.estudos.primeirospassos;

import org.springframework.stereotype.Component;

@Component // Quando vou criar um componente no MyApp, também preciso transformar os outros objetos em componentes
public class Calculadora {
    public int somar(int n1, int n2){
        return n1+n2;
    }
}
