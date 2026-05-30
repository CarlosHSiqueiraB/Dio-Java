package com.estudos.gerenciamentoprodutos.dto;

public record ProdutoRequest(
        String nome,
        Double preco,
        String categoria
) {
}
