package march_fifth;

public class Arqueiro extends Personagem {
    public Arqueiro(String nome){super(nome,90,70);}

    @Override
    public void usarHabilidade(Personagem alvo){
        int custoEnergia = 25;
        if (this.energia >= custoEnergia){
            this.energia -= custoEnergia;
            System.out.println(this.nome + " dispara FLECHA PRECISA em " + alvo.nome +"!");

            int dano =  20;
            // Chance de 30% de causar dano crítico(dobrado)
            if (Math.random() < 0.3){
                System.out.println("ACERTO CRÍTICO");
                dano *= 2;

            }
            alvo.receberDano(dano);

        } else {
            System.out.println(this.nome + " está sem energia para a Flecha Precisa!");
        }
    }
}
