package march_sixth;
import java.util.Scanner
public class MaquinaDeBebidas {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Máquina de Bebidas Acordar ---");
        System.out.println("Escolha sua bebida: \n1-Café \n2 - Chá");

        int escolha = scanner.nextInt();
        Bebida bebidaSelecionada = null;
        if(escolha == 1){
            bebidaSelecionada = new Cafe();

        } else if (escolha == 2){
            bebidaSelecionada = new Cha();
        } else {
            System.out.println("Opção inválida");
        }

        if (bebidaSelecionada!= null){
            System.out.println("\n Iniciando preparo...");
            // *** ABSTRAÇÃO E POLIMORFISMO EM AÇÃO ***
            // A máquina não precisa saber se é Café ou Chá.
            // Ela apenas executa o contrato 'preparar()', e o objeto
            // Correto se encarrega de realizar os passos específicos
            bebidaSelecionada.preparar();
        }
        scanner.close();
    }
}
