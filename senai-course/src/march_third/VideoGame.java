package march_third;

public class VideoGame extends DispositivoDeMidia {
    private String jogoAtual;

    public VideoGame(String nome, String jogo) {
        // 'super(nome)' chama o construtor da classe mãe (DispositivoDeMidia).
        super(nome);
        this.jogoAtual = jogo;

    }

    // A anotação @Override indica que estamos cumprindo o "contrato"
    // e implementando o metodo abstrato da classe mãe.

    @Override
    public void reproduzir(){
        System.out.println("Aviso do " + this.nomeDoDispositivo + ": " + this.jogoAtual + " está disponível para jogar!");
    }
}
