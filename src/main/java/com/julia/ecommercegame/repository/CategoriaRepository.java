package com.julia.ecommercegame.repository;

import com.julia.ecommercegame.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}