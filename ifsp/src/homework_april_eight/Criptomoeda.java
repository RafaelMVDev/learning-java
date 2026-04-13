package homework_april_eight;

public class Criptomoeda implements EstrategiaPagamentoInterface{

    double desconto = 0.2;
    @Override
    public double pagar(double valor){
        double valorDesconto = valor - valor * this.desconto;
        System.out.println(
                "Pagamento no valor de R$" + valor + " com desconto de 20%!" +
                        "\nValor pago: R$ "+ valorDesconto);
        return valorDesconto;
    }

    public String getNome(){
        return "Criptomoeda";
    }
}
