package february_twenty_fifth;

public class ContaPoupanca extends Conta {

    private double taxaDeJuros = 0.005; // O.5%  ao mês
    public ContaPoupanca(Cliente titular){
        //Chama o construtor da classe mãe ( Conta )>
        super(titular);

    }

    //Método que SÓ a ContaPoupanca tem.

    public void renderJuros(){
        double juros = this.saldo * this.taxaDeJuros;
        this.saldo += juros;
        System.out.println("Juros de R$ " + String.format("%.2f", juros ) + " renderam na conta " + this.numero);
    }

}
