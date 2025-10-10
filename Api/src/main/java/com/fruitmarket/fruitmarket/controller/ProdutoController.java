package com.fruitmarket.fruitmarket.controller;

import com.fruitmarket.fruitmarket.model.Produto;
import com.fruitmarket.fruitmarket.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;

    @PostMapping("/criarProduto")
    public Produto criarProduto(@RequestBody Produto produto) {
        return produtoService.registrarProduto(produto);
    }

    @PostMapping("/buscaProdutos")
    public List<Produto> buscaProdutos(@RequestBody Produto produto) {
        return produtoService.buscaProdutos();
    }

    @PostMapping("/buscaProdutoPorId")
    public Produto buscaProdutoPorId(@RequestBody Long id) {
        return produtoService.buscaProdutoPorId(id);
    }

    @PostMapping("/buscaProdutoPorNome")
    public Produto buscaProdutoPorNome(@RequestBody String nome) {
        return produtoService.buscaProdutoPorNome(nome);
    }

    @PostMapping("/deletaProdutoPorId")
    public String deletaProdutoPorId(@RequestBody Long id) {
        return produtoService.deletaProdutoPorId(id);
    }

    @PostMapping("/atualizarProduto")
    public Produto atualizarProduto(@RequestBody Produto produto) {
        return produtoService.atualizarProduto(produto);
    }
}
