package com.estudos.gerenciamentoprodutos.service;

import com.estudos.gerenciamentoprodutos.exception.BusinessException;
import com.estudos.gerenciamentoprodutos.factory.ProdutoFactoryManager;
import com.estudos.gerenciamentoprodutos.model.Produto;
import com.estudos.gerenciamentoprodutos.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    private final ProdutoRepository repository;
    private final ProdutoFactoryManager factoryManager;

    public ProdutoService(
            ProdutoRepository repository,
            ProdutoFactoryManager factoryManager) {

        this.repository = repository;
        this.factoryManager = factoryManager;
    }

    public Produto criar(
            String nome,
            Double preco,
            String categoria) {

        Produto produto = factoryManager
                .getFactory(categoria)
                .criar(nome, preco);

        return repository.save(produto);
    }

    public List<Produto> listar() {
        return repository.findAll();
    }

    public Produto buscarPorId(Integer id) {

        return repository.findById(id)
                .orElseThrow(() ->
                        new BusinessException(
                                "Produto %d não encontrado", id));
    }

    public void excluir(Integer id) {

        Produto produto = buscarPorId(id);

        repository.delete(produto);
    }

    public List<Produto> buscarPorCategoria(
            String categoria) {

        return repository.findByCategoria(categoria);
    }
}