package february_twenty_fourth;


// Herói É UM PERSONAGEM. Herda todos os métodos e atributos da classe Personagem
public class Heroi extends Personagem {

    // Atributos específicos do Herói

    private int pocoesDeCura;

    public Heroi(String nome, int pontosDeVida, int forca, String arma) {
        // Chama o construtor de Personagem para configurar os atributos herdados.

        super(nome, pontosDeVida, forca,arma); // chama o método construtor da classe pai
        this.pocoesDeCura = 2; // Começa sempre com 2 poções

    }


    // Método específico do Herói
    public void usarPocao(){
        if (pocoesDeCura > 0){
            this.pontosDeVida += 20; // A poção cura 20 de vida
            this.pocoesDeCura --;
            System.out.println(this.nome + " usou uma poção de cura! Vida atual " + this.pontosDeVida);
        } else {
            System.out.println(this.nome + " não tem mais poções de cura");
        }
    }

}
