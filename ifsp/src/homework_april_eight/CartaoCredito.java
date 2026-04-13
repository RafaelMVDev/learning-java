package homework_april_eight;

public class CartaoCredito implements EstrategiaPagamentoInterface {

    @Override
    public double pagar(double pagamento){
        return pagamento;
    }

    public String getNome(){
        return "Pix";
    }
}
