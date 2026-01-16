package com.pizzaria.pizzariaback.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Um controller gerencia os endpoints (URLs) da aplicação,
// processando requisições HTTP (GET, POST, PUT, DELETE, etc.)
// e retornando respostas para o cliente (JSON, XML, etc.)
// Funciona como intermediário entre o cliente e a lógica de negócio(service).

//Stateless => a cada nova requisição recebe novas informações.(Usa token).
//Statefull => mantêm informações.

// Define esta classe como controlador Spring que processa requisições HTTP.
// @Controller
// Indica que os métodos retornam o resultado direto (não uma view/template).
// @ResponseBody

// Define esta classe como controlador REST que retorna dados em formato JSON/XML
//Combinação de @Controller + @ResponseBody.
@RestController
//Define a url.
@RequestMapping("/Teste")
public class TesteController {

    @GetMapping
    public String teste(){
        return "Hello World";
}    
}
