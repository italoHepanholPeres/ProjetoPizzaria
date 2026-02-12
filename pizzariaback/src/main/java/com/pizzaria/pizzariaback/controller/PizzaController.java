package com.pizzaria.pizzariaback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pizzaria.pizzariaback.dto.PizzaRequestDTO;
import com.pizzaria.pizzariaback.dto.PizzaResponseDTO;
import com.pizzaria.pizzariaback.service.PizzaService;

@RestController
@RequestMapping("/pizza")
public class PizzaController {

    @Autowired
    private PizzaService pizzaService;

    @GetMapping
    public Page<PizzaResponseDTO> listAllPizza(Pageable pageable){
        return pizzaService.listAllPizza(pageable);
    } 

    
    @PostMapping
    public ResponseEntity<PizzaResponseDTO> savePizza(@RequestBody PizzaRequestDTO pizzaToSave){
        PizzaResponseDTO savedPizza = pizzaService.save(pizzaToSave);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(savedPizza);
    }

}
