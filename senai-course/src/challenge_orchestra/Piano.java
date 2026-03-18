package challenge_orchestra;

public class Piano extends Instrumento {
    String nome;
    public Piano(){
       this.nome = "Piano";
    }
    public String getNome(){
        return this.nome;
    }
    @Override
    public void emitirSom(){
        System.out.println("DIM DIM DUMM");
    }
}
