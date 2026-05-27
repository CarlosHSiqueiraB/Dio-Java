package com.estudos.primeirospassos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimeirosPassosApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrimeirosPassosApplication.class, args);
        // Jamais devemos prover esse tipo de código no springboot, não devemos usar new
        // Calculadora calculadora = new Calculadora();
        // System.out.println("O resultado é: "+calculadora.somar(3,5));

        // Após toda modificação que foi anotada nos outros arquivos, é esperado que o objeto calculadora foi devidamente associado como uma dependência


    }
}

