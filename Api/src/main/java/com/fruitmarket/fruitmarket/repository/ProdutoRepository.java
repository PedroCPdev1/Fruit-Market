package com.fruitmarket.fruitmarket.repository;

import com.fruitmarket.fruitmarket.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    Produto buscaPorNome(String nome);
}
