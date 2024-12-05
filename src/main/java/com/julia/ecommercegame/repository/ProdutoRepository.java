package com.julia.ecommercegame.repository;

import com.julia.ecommercegame.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}