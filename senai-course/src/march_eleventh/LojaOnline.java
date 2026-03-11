package march_eleventh;
import java.util.Scanner;
public class LojaOnline {
    public static void main(String[] args) throws InterruptedException { // regra de segurança
        Scanner scanner = new Scanner(System.in);
        Pedido meuPedido = new Pedido(101,250.75);

        System.out.println("--- Bem-vindo à Loja Xopis ---");
        System.out.println("Seu pedido de R$ " + meuPedido.getValorTotal() + " está pronto para pagamento.");
        System.out.println("\nEscolha a forma de pagamento:");
        System.out.println("1 - Cartão");
        System.out.println("2 - PIX");
        System.out.println("3 - Boleto"); // NOVO

        int escolha = scanner.nextInt();

        ProcessadorPagamento processador = null; //inicialização de um objeto vazio

        if(escolha ==1){
            System.out.println("Escolha o tipo de cartão: (1 - Crédito, 2 - Débito)");
            int tipoCartao = scanner.nextInt();
            if(tipoCartao == 1){
                processador = new PagamentoCartao(TipoCartao.CREDITO);
            } else {
                processador = new PagamentoCartao(TipoCartao.DEBITO);
            }
        } else if (escolha == 2) {
            processador = new PagamentoPix();
        } else if (escolha == 3){
            // NOVO: Instanciando nosso novo processador de boleto.
            processador = new PagamentoBoleto();
        }

        if (processador!= null){
            System.out.println("\nIniciando processo de pagamento...");
            // A loja não precisa saber se o processador é Cartão de Crédito, Débito,PIX ou Boleto.
            // A chamada é EXATAMENTE A MESMA para todos, graças à interface.

            String transacaoId = processador.iniciarPagamento(meuPedido);
            System.out.println("\n--- Verificando Status da Transação ---");

            while(meuPedido.getStatus() == StatusPagamento.PENDENTE){
                System.out.println("Aguarde, consutlando status...");
                Thread.sleep(2000); //pausa em milisegundos

                StatusPagamento statusAtual = processador.verificarStatus(transacaoId);
                meuPedido.setStatus(statusAtual);

            }

            System.out.println("\n--- Resultado Final ---");
            System.out.println("Status do Pedido "+ meu Pedido.getId() + ": " + meuPedido.getStatus());

            if(meuPedido.getStatus() == StatusPagamento.APROVADO){
                System.out.println("Obrigado pela sua compra! Seu produto será enviado.");
            } else {
                System.out.println("Houve um problema com seu pagamento. Por favor, tente novamente.");
            }
        } else{
            System.out.println("Forma de pagamento inválida.");
        }
        scanner.close();
    }
}
