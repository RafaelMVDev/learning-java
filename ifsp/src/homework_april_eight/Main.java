package homework_april_eight;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        AuditoriaLog logger = AuditoriaLog.getInstancia();
        Scanner scan = new Scanner(System.in);
        int carrinho = 100;

        System.out.println("===== Exemplo com Input ========");
        System.out.print("Digite sua forma de pagamento: ");
        String optEstrategia = scan.nextLine();

        EstrategiaPagamentoInterface estrategia = PagamentoFactory.gerar(optEstrategia);

        logger.registrar(estrategia,20);
        carrinho -= 20;

        System.out.println("\n===== Exemplo com Criptomoeda ========");

        EstrategiaPagamentoInterface estrategia2 = PagamentoFactory.gerar("criptomoeda");
        logger.registrar(estrategia2,50);
        carrinho -= 50;

    }

}
