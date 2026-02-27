package february_twenty_fifth;

import java.util.ArrayList;

public class Conta {
    // Protected permite que as classes filhas acessem diretamente estes atributos.
    protected ArrayList<String> chaves_pix = new ArrayList<>();
    protected int numero;
    protected Cliente titular;
    protected double saldo;
    protected static int totalDeContas = 0;

    //Construtor que será chamado pelas classes filhas via 'super()'.

    public Conta(Cliente titular){
        Conta.totalDeContas++;
        this.numero = totalDeContas;
        this.titular = titular;
        this.saldo = 0;
    }

    // Métodos concretos que serão herdados por todas as contas filhas.

    public void depositar(double valor){
        if (valor > 0){
            this.saldo += valor;
            System.out.println("Deposito de R$ " + valor + " realizado com sucesso.");

        } else {
            System.out.println("Valor de deposito inválido.");
        }
    }

    public boolean sacar(double valor){
        if (valor > 0  && this.saldo >= valor){
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
            return true;
        } else {
            System.out.println("Operação falhou! Saldo insuficiente ou valos inválido.");
            return false;
        }
    }

    public void transferir(Conta destino, double valor){
        if (this.sacar(valor)){
            destino.depositar(valor);
            System.out.println("Transferência concluída.");
        } else {
            System.out.println("Transferência não realizada.");
        }
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public String getNomeTitular() {
        return this.titular.getNome();
    }

    public void exibirDados(){
        System.out.println("--- Dados da Conta ---");
        //getClass().getSimpleName() mostra o nome da classe específica (ContaCorrente ou Conta Poupanca)

        System.out.println("Tipo.....: " + this.getClass().getSimpleName());
        System.out.println("Titular.: " + this.getNomeTitular());
        System.out.println("Número.: " + this.getNumero());
        System.out.println("Saldo...: R$ " +String.format("%.2f", this.getSaldo()));
        System.out.println("-------------------------");
    }

    // Seção pix
    public void adicionarChave(String chave){
        this.chaves_pix.add(chave);
    }

    public boolean chaveExiste(String chave_goal){

        for (String c : this.chaves_pix ){
            if (c.equals(chave_goal)){
                return true;
            }
        }
        return false;
    }

    public void listarChaves(){
        System.out.println("====== Chaves ======");
        for (String chave : this.chaves_pix){
            System.out.println(chave);
        }
    }

    public void fazerPix(Conta c, double valor){

        this.transferir(c,valor);

    }
}

