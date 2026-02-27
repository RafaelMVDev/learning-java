package february_twenty_fifth;

public class ContaSalario extends Conta{
    public ContaSalario(Cliente cliente){
        super(cliente);
    }


    public void transferir_salario(Conta destino) {
        System.out.println("Transferindo salário...");
        super.transferir(destino, this.saldo);
    }
}
