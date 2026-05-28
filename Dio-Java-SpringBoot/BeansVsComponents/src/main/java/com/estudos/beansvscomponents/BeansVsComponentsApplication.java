//package com.estudos.beansvscomponents;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;
//
//@SpringBootApplication
//public class BeansVsComponentsApplication {
//
//    public static void main(String[] args) {
//        SpringApplication.run(BeansVsComponentsApplication.class, args);
//    }
//
//    @Bean // Aqui aviso ao código que tenho uma commandLineRunner, e falo que essa classe(clr), que tem função de executar as ações do código, é um bean, ṕq ela não é uma implementação, uma interface, então faço ela ser aplicável
//    public CommandLineRunner run(ConversorJson conversor) throws Exception {
//        return args -> {
//            String json = "{\"cep\": \"01001-000\",\"logradouro\": \"Praça da Sé\",\"localidade\": \"São Paulo\"}";
//            ViaCepResponse response = conversor.converter(json);
//            System.out.println("Dados do CEP: " + response);
//        };
//    }
//
//    // Bean = não tenho acesso ao código fonte, então tenho que tornar acessível
//    // Component = Quando tenho acesso ao código fonte
//
//}
