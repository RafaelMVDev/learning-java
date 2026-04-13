package homework_april_eight;

public class AuditoriaLog {
    private static AuditoriaLog AuditoriaInstance;

    private void AuditoriaLog(){}

    public static synchronized AuditoriaLog getInstancia(){
        if (AuditoriaInstance == null){
            AuditoriaInstance = new AuditoriaLog();

        }
        return AuditoriaInstance;
    };

    public void registrar(EstrategiaPagamentoInterface est, double valor){
        double valorPago = est.pagar(valor);
        System.out.print("LOG: Pagamento de R$ " + valorPago + " realizado via " + est.getNome());
    }
}
