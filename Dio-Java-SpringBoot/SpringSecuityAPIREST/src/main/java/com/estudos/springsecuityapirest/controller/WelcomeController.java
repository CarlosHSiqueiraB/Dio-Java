package com.estudos.springsecuityapirest.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping
    public String welcome(){
        return "Welcome to My Spring Boot Web API";
    }
    @GetMapping("/users")
//    @PreAuthorize("hasAnyRole('MANAGERS','USERS')") // Aqui faço o controle de rotas, são esses cargos que conseguem acessar essa rota
    public String users() {
        return "Authorized user";
    }
    @GetMapping("/managers")
//    @PreAuthorize("hasAnyRole('MANAGERS')") // Aqui só o managers
    public String managers() {
        return "Authorized manager";
    }
}
