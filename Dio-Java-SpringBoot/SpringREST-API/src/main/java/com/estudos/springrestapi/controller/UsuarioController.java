package com.estudos.springrestapi.controller;

import com.estudos.springrestapi.model.Usuario;
import com.estudos.springrestapi.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users") // Definindo rota default
public class UsuarioController {
    @Autowired
    private UsuarioRepository repository;
    @GetMapping // Sempre que formos usar recursos get diferentes, precisamos dizer qual operação deve ser realizada, diferenciando pela chaves, usando mapeamento
    public List<Usuario> getUsers(){
        return repository.listAll();
    }

    @GetMapping("/{login}")
    public Usuario findOne(@PathVariable("login") String login){ // O pathVariable é quem define o valor passado que é no caso o {login}
        return repository.findByLogin(login);
    }
    @DeleteMapping("/{id}") // Usar PostMan
    public String delete(@PathVariable("id") Integer id){
        repository.remove(id);

        return "Usuário removido com sucesso";
    }

    @PostMapping
    public String postUser(@RequestBody Usuario usuario){
        repository.save(usuario);
        return "Usuário Cadastrado com Sucesso!";
    }

}
