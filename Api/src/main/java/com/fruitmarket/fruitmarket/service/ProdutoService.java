package com.fruitmarket.fruitmarket.service;

import com.fruitmarket.fruitmarket.model.Produto;
import com.fruitmarket.fruitmarket.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto salvarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }
}
