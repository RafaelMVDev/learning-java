package february_twenty;

public class Jogador {
    private String nome;
    private int pontuacao;
    private int vida;

    // 'final' significa que o valor não pode ser alterado após a inicialização
    // 'static' significa que este valor pertence à classe, não a um objeto individual

    private static final int VIDA_MAXIMA = 100; // referência
    private static int numero_jogadores = 0; // contador (não depende do estado de um objeto )

    public Jogador(String nome){
        numero_jogadores++; // Incrementa na criação do objeto para contagem
        this.nome = nome;
        this.pontuacao = 0;
        this.vida = VIDA_MAXIMA;
        System.out.println("Jogador " + this.nome +  " entrou no jogo!");
    }

    // A pontuação só pode aumentar
    public void adicionarPontos(int pontos) {
        if (pontos > 0){
            this.pontuacao += pontos;
            System.out.println("Jogador " + this.nome + " entrou no jogo!");
        }
    }

    // Controla o dano recebido
    public void receberDano(int dano){
        if (dano > 0) {
            this.vida -= dano;
            if(this.vida < 0) this.vida = 0;
            System.out.println(this.nome + "recebeu " + dano + " de dano! Vida atual: " + this.vida);
        }
        if (this.vida == 0) {
            System.out.println(this.nome + " foi derrotado!");
        }

    }

    // Controla a cura recebida, não deixando passar da vida máxima

    public void receberCura(int cura){
        if (cura > 0 && this.vida > 0) { // cura deve ser um valor positivo é só pode curar se estiver vivo
            this.vida += cura;
            if (this.vida > VIDA_MAXIMA) this.vida = VIDA_MAXIMA;
            System.out.println(this.nome + " recuperou " + cura + " de vida! Vida atual: " + this.vida);
        }
    }

    // 'Restart' caso jogador queira continuar a jogar
    public void ressuscitar(){
        if (this.vida == 0 ){
            System.out.println("Ressuscitando!");
            this.vida = VIDA_MAXIMA;
        }
    }


    // getters
    public int getPontuacao() { return this.pontuacao;}
    public int getVida(){return this.vida;};
    public String getNome() { return this.nome;}
}
