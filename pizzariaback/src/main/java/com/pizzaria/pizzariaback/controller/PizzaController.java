package com.pizzaria.pizzariaback.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pizzaria.pizzariaback.Entities.Pizza;
import com.pizzaria.pizzariaback.service.PizzaService;

@RestController
@RequestMapping("/pizza")
public class PizzaController {

    @Autowired
    private PizzaService pizzaService;

    @GetMapping("/all")
    public List<Pizza> ListAllPizza(){
        return pizzaService.ListAllPizza();
    } 

}
