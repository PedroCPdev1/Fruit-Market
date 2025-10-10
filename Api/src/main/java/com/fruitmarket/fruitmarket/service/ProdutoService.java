package com.fruitmarket.fruitmarket.service;

import com.fruitmarket.fruitmarket.model.Produto;
import com.fruitmarket.fruitmarket.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto registrarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    public List<Produto> buscaProdutos() {
        return produtoRepository.findAll();
    }

    public Produto buscaProdutoPorId(Long id) {
        return produtoRepository.findById(id).orElse(null);
    }

    public Produto buscaProdutoPorNome(String nome) {
        return produtoRepository.buscaPorNome(nome);
    }

    public String deletaProdutoPorId(Long id) {
        produtoRepository.deleteById(id);
        return "Produto: " + id + " deletado com sucesso!";
    }

    public Produto atualizarProduto(Produto produto) {
        Produto produtoExistente = produtoRepository.findById(produto.getId()).orElse(null);
        produtoExistente.setNome(produto.getNome());
        produtoExistente.setPreco(produto.getPreco());
        produtoExistente.setQuantidade(produto.getQuantidade());
        return produtoRepository.save(produtoExistente);
    }

}
