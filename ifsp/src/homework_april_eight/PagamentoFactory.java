package homework_april_eight;

public class PagamentoFactory {

    public static EstrategiaPagamentoInterface gerar(String formaPagamento){
        String fpNormalizado = formaPagamento.toLowerCase();
        if (fpNormalizado.equals("pix")){
            return new Pix();
        } else if (fpNormalizado.equals("cartao")) {
            return new CartaoCredito();
        }
        else if (fpNormalizado.equals("criptomoeda")) {
            return new Criptomoeda();
        }
       throw new IllegalArgumentException("Forma de Pagamento Desocnhecida");
    };

}
