package march_third;

public class RadioAutomotivo extends DispositivoDeMidia{
    public double estacaoAtualFM;

    public RadioAutomotivo (String nome, double estacao){
        // Chamando o construtor da classe mãe.

        super(nome);
        this.estacaoAtualFM = estacao;
    }

    @Override
    public void reproduzir(){
        System.out.println("O " + this.nomeDoDispositivo + " está sintonizando na estação de rádio FM " + this.estacaoAtualFM + ".");
    }
}
