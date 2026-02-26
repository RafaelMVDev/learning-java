package february_twenty_fifth;

public class ContaEmpresa extends Conta{

    public ContaEmpresa(Cliente cliente){
        super(cliente);
    }

    public void fazerInvestimento(String nome_investimento, double quantia){
        System.out.println("Investindo R$" + " na ação: " + nome_investimento);
    }
}
