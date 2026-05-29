package com.estudos.springrestapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Para denominar uma classe como componente REST, preciso chamala de REST CONTROLLER
public class WelcomeController {
    @GetMapping // Aqui denomino como algo que vai retornar um recurso HTTP, então chamo de get
    public String welcome(){
        return "Welcome to my Spring Boot Web API";
    }


}
