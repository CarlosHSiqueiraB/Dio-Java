package com.estudos.gerenciamentoprodutos.factory;

import com.estudos.gerenciamentoprodutos.model.Produto;
import org.springframework.stereotype.Component;

@Component
public class LivroFactory
        implements ProdutoFactory {

    @Override
    public Produto criar(
            String nome,
            Double preco) {

        Produto produto = new Produto();

        produto.setNome(nome);
        produto.setPreco(preco);
        produto.setCategoria("LIVRO");

        return produto;
    }
}
