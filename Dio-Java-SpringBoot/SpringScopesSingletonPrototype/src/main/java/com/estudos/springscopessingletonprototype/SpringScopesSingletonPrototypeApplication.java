package com.estudos.springscopessingletonprototype;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

// Objetivo do sistema: Enviar mensagens de boas vindas durante o cadastro de um usuário
@SpringBootApplication
public class SpringScopesSingletonPrototypeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringScopesSingletonPrototypeApplication.class, args);
    }
    @Bean
    public CommandLineRunner run(SistemaMensagem sistema) throws Exception {
        return args -> {
            sistema.enviarConfirmacaoCadastro();
            sistema.enviarMensagemBoasVindas();
            sistema.enviarConfirmacaoCadastro();
        };
    }

}
