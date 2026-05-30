package com.estudos.gerenciamentoprodutos.dto;

import com.estudos.gerenciamentoprodutos.model.Produto;
import org.springframework.stereotype.Component;

@Component
public class ProdutoMapper {

    public ProdutoDTO toDTO(
            Produto produto){

        return new ProdutoDTO(
                produto.getId(),
                produto.getNome(),
                produto.getPreco()
        );
    }
}
