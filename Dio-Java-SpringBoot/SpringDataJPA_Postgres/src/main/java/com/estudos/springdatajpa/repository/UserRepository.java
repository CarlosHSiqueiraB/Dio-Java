package com.estudos.springdatajpa.repository;
import com.estudos.springdatajpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

// Aqui é onde o framework trabalha de verdade, ele vai disponibilizar os métodos dessa forma
public interface UserRepository extends JpaRepository<User, Integer> {
}
