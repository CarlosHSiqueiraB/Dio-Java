package com.estudos.gerenciamentoprodutos.factory;

import com.estudos.gerenciamentoprodutos.model.Produto;

public interface ProdutoFactory {

    Produto criar(String nome, Double preco);
}
