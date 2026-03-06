package march_fifth;

public class Mago extends Personagem {

    public Mago(String nome){super(nome,80,100);}

    @Override
    public void usarHabilidade(Personagem alvo){
        int custoEnergia = 30;
        if (this.energia >= custoEnergia){
            this.energia -= custoEnergia;
            System.out.println(this.nome + " lança BOLA DE FOGO em " + alvo.nome +"!");
            alvo.receberDano(25); // Dano alto e direto

        } else {
            System.out.println(this.nome + " está sem energia para o Golpe Fulminante!");
        }
    }

}
