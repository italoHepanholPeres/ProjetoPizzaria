package com.pizzaria.pizzariaback.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pizzaria.pizzariaback.Entities.Pizza;

public interface PizzaRepository extends JpaRepository<Pizza,Long>{
    
}
