package com.example.primeiraapi;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HomeController {
    @GetMapping("/")
    public String inicio(){
        return "API funcionando com Spring Boot!";
    }

    @GetMapping("/mensagem")
    public String mensagem(){
        //Retorna uma mensagem de boas-vindas
        return "Bem-vindos à aula prática de Spring Boot!";
    }
}
