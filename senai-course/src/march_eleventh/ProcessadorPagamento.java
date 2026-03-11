package march_eleventh;
//*** ABSTRAÇÃO AQUI ***
// Nosso contrato. Todo processador DEVE saber
//Como 'iniciarPagamento' e 'verificarStatus'
public interface ProcessadorPagamento {
    //Inicia o processo de pagamento  e retorna um ID da transação.
    String iniciarPagamento(Pedido pedido);

    //Verifica o status de uma transação existente.
    StatusPagamento verificarStatus(String idTransacao);
}
