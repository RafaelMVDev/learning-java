package com.example.primeiraapi;

public class Produto {
    private long id;
    private String nome;
    private double preco;

    public Produto(Long id,String nome, double preco){
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public long getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }
}
