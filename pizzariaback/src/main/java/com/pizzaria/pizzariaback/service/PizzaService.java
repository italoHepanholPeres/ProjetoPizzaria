package com.pizzaria.pizzariaback.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.pizzaria.pizzariaback.Entities.Pizza;
import com.pizzaria.pizzariaback.dto.PizzaRequestDTO;
import com.pizzaria.pizzariaback.dto.PizzaResponseDTO;
import com.pizzaria.pizzariaback.mappers.PizzaMapper;
import com.pizzaria.pizzariaback.repository.PizzaRepository;

@Service
public class PizzaService {
    
    @Autowired
    private PizzaRepository pizzaRepository;

    public Page<PizzaResponseDTO> listAllPizza(Pageable pageable){
        return pizzaRepository
                .findAll(pageable)
                .map(PizzaResponseDTO::new);
    }

    public PizzaResponseDTO save(PizzaRequestDTO dto){
        Pizza pizzaToSave = PizzaMapper.toEntity(dto);
        Pizza savedPizza = pizzaRepository.save(pizzaToSave);

        return PizzaMapper.toDto(savedPizza);
    }
}
