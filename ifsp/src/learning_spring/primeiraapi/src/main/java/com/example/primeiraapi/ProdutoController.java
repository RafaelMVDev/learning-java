package com.example.primeiraapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
public class ProdutoController {
    @GetMapping("/produto")
    public Produto produto(){
        //Cria e retorna um objeto Produto
        //O Spring Boot converte ese objeto automaticamente em JSON
        return new Produto(1L, "Notebook",3500.00);
    }

    @GetMapping("/produtos")
    //Retorna uma lista com vários produtos
    //O Spring Boot converte a lista em JSON automaticante

    public List<Produto> listarProdutos(){
        return List.of(
                new Produto(1L, "Notebook",3500),
                new Produto(2L, "Mouse",89),
                new Produto(3L, "Notebook",150)

        );
    }
}
