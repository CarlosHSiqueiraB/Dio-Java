package com.estudos.gerenciamentoprodutos.factory;

import com.estudos.gerenciamentoprodutos.exception.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProdutoFactoryManager {

    @Autowired
    private EletronicoFactory eletronicoFactory;

    @Autowired
    private LivroFactory livroFactory;

    public ProdutoFactory getFactory(String categoria){

        return switch (categoria){

            case "ELETRONICO" -> eletronicoFactory;

            case "LIVRO" -> livroFactory;

            default ->
                    throw new BusinessException(
                            "Categoria inválida");
        };
    }
}


