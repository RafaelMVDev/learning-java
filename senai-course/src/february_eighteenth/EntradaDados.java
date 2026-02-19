package february_eighteenth;
import java.util.Scanner;
public class EntradaDados {

    private Scanner scanner;

    public EntradaDados(){
        scanner = new Scanner(System.in);
    }

    public Fruta lerFruta(){
        System.out.println("Digite o nome da fruta: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a quantidade em estoque de " + nome + ":");
        int quantidade = scanner.nextInt();

        return new Fruta(nome,quantidade);
    }

    public void fecharScanner(){
        scanner.close();
    }
}
