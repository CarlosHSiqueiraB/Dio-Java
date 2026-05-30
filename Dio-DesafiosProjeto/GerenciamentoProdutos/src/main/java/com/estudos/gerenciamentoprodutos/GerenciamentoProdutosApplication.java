package com.estudos.gerenciamentoprodutos;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GerenciamentoProdutosApplication {

    @Value("${teste.valor}")
    private String valor;

    @PostConstruct
    public void teste() {
        System.out.println(valor);
    }

    public static void main(String[] args) {
        SpringApplication.run(
                GerenciamentoProdutosApplication.class,
                args);
    }
}
