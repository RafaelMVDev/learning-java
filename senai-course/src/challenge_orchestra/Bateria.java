package challenge_orchestra;

public class Bateria extends Instrumento {
    String nome;
    public Bateria(){
        this.nome = "Bateria";
    }

    public String getNome(){
        return this.nome;
    }
    @Override
    public void emitirSom(){
        System.out.println("BADUM TSSS... BADUM TSSS");
    }
}
