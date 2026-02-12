package com.pizzaria.pizzariaback.mappers;

import com.pizzaria.pizzariaback.Entities.Pizza;
import com.pizzaria.pizzariaback.dto.PizzaRequestDTO;
import com.pizzaria.pizzariaback.dto.PizzaResponseDTO;

public class PizzaMapper {

    public static Pizza toEntity(PizzaRequestDTO dto){
        Pizza pizza = new Pizza();
        pizza.setName(dto.name());
        pizza.setPrice(dto.price());
        pizza.setDescription(dto.description());
        pizza.setVisible(dto.visible());
        return pizza;
    }

    public static PizzaResponseDTO toDto(Pizza pizza){
        return new PizzaResponseDTO(pizza);
    }
}
