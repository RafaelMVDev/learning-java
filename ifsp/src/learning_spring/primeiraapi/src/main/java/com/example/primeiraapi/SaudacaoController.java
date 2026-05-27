package com.example.primeiraapi;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class SaudacaoController {
    @GetMapping("/saudacao")
    public String saudacao(@RequestParam(defaultValue = "Visitante") String nome){
        return "Olá " + nome + "! Seja bem-vindo ao Spring Boot";
    }
}
