package february_eleventh;

import java.util.Scanner;

public class ex1_matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m,n;
        System.out.print("Quantas linhas vai ter cada matriz? ");
        m = sc.nextInt();
        System.out.print("Quantas colunas vai ter cada matriz? ");
        n = sc.nextInt();

        // Criando matrizes com m linhas e n colunas
        int[][] matriz  = new int[m][n];


        for (int i = 0; i < m;i++){
            for (int j = 0; j < n; j ++){
                System.out.printf("Elemento [%d,%d]:  ",i,j);
                matriz[i][j] = sc.nextInt();
            }

        }

        System.out.println("VALORES NEGATIVOS:");


        for (int i = 0; i < m;i++){
            for (int j = 0; j < n; j ++){
                System.out.printf("Elemento %d\n",matriz[i][j]);

            }

        }

        sc.close();
    }
}
