package com.pizzaria.pizzariaback.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pizzaria.pizzariaback.Entities.Pizza;
import com.pizzaria.pizzariaback.repository.PizzaRepository;

@Service
public class PizzaService {
    
    @Autowired
    private PizzaRepository pizzaRepository;

    public List<Pizza> ListAllPizza(){
        return pizzaRepository.findAll();
    }
}
