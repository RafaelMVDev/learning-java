package february_eleventh;

import java.util.Scanner;

public class ex2_matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m,n;
        System.out.print("Quantas linhas vai ter cada matriz? ");
        m = sc.nextInt();
        System.out.print("Quantas colunas vai ter cada matriz? ");
        n = sc.nextInt();

        // Criando 3 matrizes ( A,B,C)
        int[][] a = new int[m][n];
        int[][] b = new int[m][n];
        int[][] c = new int[m][n];

        // Leitura da matriz A

        System.out.println("Digite os valores da matriz A: ");
        for (int i = 0; i < m;i++){
            for (int j = 0; j < n; j ++){
                System.out.printf("Elemento [%d,%d]:  ",i,j);
                a[i][j] = sc.nextInt();
            }

        }

        // Leitura da matriz B

        System.out.println("Digite os valores da matriz B: ");
        for (int i = 0; i < m;i++){
            for (int j = 0; j < n; j ++){
                System.out.printf("Elemento [%d,%d]:  ",i,j);
                b[i][j] = sc.nextInt();
            }

        }

        // Somando matrizes A e B ( Resultados da matriz C )


        for (int i = 0; i < m;i++){
            for (int j = 0; j < n; j ++){

                c[i][j] = a[i][j] + b[i][j];
                System.out.printf("Elemento [%d,%d]: %d  ",i,j,c[i][j]);
            }
            System.out.println(); // Nova linha por linha da matriz
        }
        sc.close();
    }
}
