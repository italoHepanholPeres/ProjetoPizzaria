package com.pizzaria.pizzariaback.dto;

import java.math.BigDecimal;

import com.pizzaria.pizzariaback.Entities.Pizza;

public record PizzaResponseDTO(String name, BigDecimal price, String description, String photo) {
    public PizzaResponseDTO(Pizza pizza){
        this(pizza.getName(), pizza.getPrice(), pizza.getDescription(), pizza.getPhoto());
    }
}
