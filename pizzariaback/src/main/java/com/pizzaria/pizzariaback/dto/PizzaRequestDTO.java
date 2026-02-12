package com.pizzaria.pizzariaback.dto;

import java.math.BigDecimal;

public record PizzaRequestDTO(String name, BigDecimal price, String description, Boolean visible) {
    
}
