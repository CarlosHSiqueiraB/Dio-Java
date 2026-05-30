package com.estudos.gerenciamentoprodutos.controller;


import com.estudos.gerenciamentoprodutos.dto.ProdutoRequest;
import com.estudos.gerenciamentoprodutos.model.Produto;
import com.estudos.gerenciamentoprodutos.service.ProdutoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoService service;

    public ProdutoController(ProdutoService service) {
        this.service = service;
    }

    @PostMapping
    public Produto criar(@RequestBody ProdutoRequest request) {

        return service.criar(
                request.nome(),
                request.preco(),
                request.categoria()
        );
    }

    @GetMapping
    public List<Produto> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Produto buscarPorId(@PathVariable Integer id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public String excluir(@PathVariable Integer id) {

        service.excluir(id);

        return "Produto removido com sucesso.";
    }

    @GetMapping("/categoria/{categoria}")
    public List<Produto> buscarPorCategoria(
            @PathVariable String categoria) {

        return service.buscarPorCategoria(categoria);
    }
}