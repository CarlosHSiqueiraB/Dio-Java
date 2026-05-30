package com.estudos.gerenciamentoprodutos.repository;

import com.estudos.gerenciamentoprodutos.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository
        extends JpaRepository<Produto, Integer> {

    List<Produto> findByCategoria(String categoria);
}