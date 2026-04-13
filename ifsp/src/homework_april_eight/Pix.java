package homework_april_eight;

public class Pix implements EstrategiaPagamentoInterface {
    double desconto = 0.1;

    @Override
    public double pagar(double valor){
        double valorDesconto = valor - valor * this.desconto;

        System.out.println(
                "Pagamento no valor de R$" + valor + " com desconto de 10%!" +
                "\nValor pago: R$ "+ valorDesconto);
        return valorDesconto;
    }

    public String getNome(){
        return "Pix";
    }

}
