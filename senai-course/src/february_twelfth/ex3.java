package february_twelfth;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3]; //tamanho da matriz 3x3

        //Preencher a matriz
        int valor = 1;
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                matriz[i][j] = valor++;
            }
        }

        // Mostrar os valores
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();

        }
    }
}
