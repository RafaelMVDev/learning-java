package february_twenty_fifth;

public class ContaCorrente extends Conta {
    private double taxaDeManutencao = 15.90;

    public ContaCorrente(Cliente titular){
        //Chama o construtor da classe mãe (Conta).
        super(titular);
    }

    // Método que SÓ a ContaCorrente tem.
    public void cobrarTaxa(){
        this.saldo -= this.taxaDeManutencao;
        System.out.println("Taxa de manutenção de R$ " + taxaDeManutencao + " cobrada da conta " + this.numero);
    }
}
