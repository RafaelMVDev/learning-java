package challenge_orchestra;

public class Violao extends Instrumento {
    String nome;
    public Violao(){
        this.nome = "Violão";
    }
    public String getNome(){
        return this.nome;
    }
    @Override
    public void emitirSom(){
        System.out.println("PEOWNN, PEOWWNNN");
    }
}
