package february_twelfth;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[3]; // Declaração de vetor

        for (int i = 0; i < 3; i++){
            System.out.print("\n Digite o nome " + (i+1) + ": ");
            nomes[i] = sc.nextLine(); // armazendo no vetor
        }
        System.out.print("Lista de  nomes ");

        for (int i = 0; i < nomes.length; i++){
            System.out.print((i+1) + "º: " + nomes[i]); // exibindo o conteúdo do vetor
        }
    }
}
