package february_eleventh;

import java.util.Scanner;

public class ex3_matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] numeros = new int[3][2];


        for( int i = 0; i <3; i++){
            for (int j = 0; j <2;j++){
                System.out.printf("Digite um valor para a posição [%d,%d]:  ",i,j);
                numeros[i][j] = sc.nextInt();
            }
            ;
        }

        // Leitura da matriz A

        System.out.println("Digite os valores da matriz A: ");
        for (int i = 0; i < 3;i++){
            for (int j = 0; j < 2; j ++){
                System.out.printf("Posição[%d,%d]: %d,  ",i,j,numeros[i][j]);

            }
            System.out.println("");

        }

    }
}
