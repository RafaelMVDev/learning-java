package february_eighteenth;

public class Fruta
{
    private String nome;
    private int quantidade;

    public Fruta(String nome, int quantidade){
        this.nome = nome;
        this.quantidade  = quantidade;
    }

    public String getNome(){
        return nome;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public boolean isEstoqueBaixo(){
        return quantidade < 10;
    }
}
