package february_nineteenth;

public class ContaBancaria {

    // *** ENCAPSULAMENTO AQUI ***
    // O atributo 'saldo' é privado (private).
    // Isso significa que ele só pode ser acessado diretamente DENTRO desta classe.

    private double saldo;

    // Construtor para iniciar a conta com um saldo inicial

    public ContaBancaria(double saldoInicial){
        if(saldoInicial > 0){
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
        }
    }

    // *** ENCAPSULAMENTO AQUI ***
    //Método PÚBLICO para sacar. É a "porta de saída de dinheiro.

    // Ele tem regras para proteger o saldo.

    public void sacar(double valor){
        if (valor > 0 && valor <= this.saldo){
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso. Novo saldo: " + this.saldo);
        } else {
            System.out.println("Saldo insuficiente ou valor de saqui inválido");
        }
    }
    // *** ENCAPSULAMENTO AQUI ***
    // Método PÚBLICO para consultar o saldo.
    // Permite VER o saldo, mas não modífícalo diretamente.

    public double getSaldo(){
        return this.saldo;
    }

}
