package february_twenty_fourth;


// Monstro possui todas as caractéristicas de um personagem
public class Monstro extends Personagem {

    // Atributo específico do Monstro

    private String tipoDeAtaque;

    public Monstro(String nome, int pontosDeVida, int forca, String tipoDeAtaque, String arma){
        super(nome,pontosDeVida,forca,arma);
        this.tipoDeAtaque = tipoDeAtaque;
    }

    // Sobrescrevendo o ataque para dar uma mensagem customziada.

    @Override // modificador para reescrever o método da superclasse
    public void atacar(Personagem alvo) {
        System.out.println(this.nome + " usa " + this.tipoDeAtaque + " em " + alvo.nome + "!");
        alvo.receberDano(this.forca);
    }
}
