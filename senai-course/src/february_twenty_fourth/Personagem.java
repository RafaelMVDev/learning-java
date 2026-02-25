package february_twenty_fourth;

public class Personagem {
    //protected mantém certo nível de encapsulamento
    protected String nome;
    protected int pontosDeVida;
    protected int forca;
    protected String arma;

    public Personagem(String nome, int pontosDeVida, int forca, String arma){
        this.nome = nome;
        this.pontosDeVida = pontosDeVida;
        this.forca = forca;
        this.arma = arma;
    }

    // Método que todos os personagens terão: atacar outro personagem.

    public void atacar(Personagem alvo) {
        System.out.println(this.nome + " ataca " + alvo.nome + "!" + "com um / uma " + this.arma);
        alvo.receberDano(this.forca); // Dano baseado na força do personagem

    }

    //Método para processar o dano recebido.

    public void receberDano(int dano){
        this.pontosDeVida -= dano;
        if (this.pontosDeVida <= 0){
            this.pontosDeVida = 0; // Evita vida negativa
            System.out.println(this.nome + " foi derrotado!");
        } else {
            System.out.println(this.nome + " recebeu " + dano + " de dano. Vida restante: " + this.pontosDeVida);
        }
    }


    // Verifica se o personagem ainda está na  batalha.
    public boolean estaVivo(){
        return this.pontosDeVida > 0;
    }


    public void exibirStatus(){
        System.out.println(nome + " Vida: " + pontosDeVida);
    }

}
