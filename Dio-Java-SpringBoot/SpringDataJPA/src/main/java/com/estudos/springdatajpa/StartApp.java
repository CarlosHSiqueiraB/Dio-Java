package com.estudos.springdatajpa;

import com.estudos.springdatajpa.model.User;
import com.estudos.springdatajpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner { //Aqui crio o commandLineRunner novamente, para dizer que os métodos serão iniciados aqui
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception { //Definindo um usuário
        User user = new User();
        user.setNome("Carlos");
        user.setUsernome("paodebatalha");
        user.setPassword("12345678DIO");

        repository.save(user);

        for(User u: repository.findAll()){
            System.out.println(u);
        }
    }
}
