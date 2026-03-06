package march_fifth;

public class Hacker extends Personagem {

    public Hacker(String nome){super(nome,9999,9999);}

    @Override
    public void usarHabilidade(Personagem alvo){
        int custoEnergia = 1;
        if (this.energia >= custoEnergia){
            this.energia -= custoEnergia;
            System.out.println(this.nome + " lança ATAQUE INSTA KILL em " + alvo.nome +"!");
            alvo.receberDano(alvo.vida); // Dano alto e direto

        } else {
            System.out.println(this.nome + " está sem energia para o Golpe Fulminante!");
        }
    }
}
