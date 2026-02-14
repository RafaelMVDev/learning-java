package february_twelfth;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        int[] numeros = new int[5]; // declaração de vetor
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        for (int i = 0; i <5 ; i++ ) {
            System.out.println("Índice " + i + ": " + numeros[i]);
        }

    }
}
