package february_twenty_fifth;

public class Conta {
    // Protected permite que as classes filhas acessem diretamente estes atributos.

    protected int numero;
    protected Cliente titular;
    protected double saldo;
    protected static int totalDeContas = 0;
}
