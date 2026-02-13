package february_thirteenth;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome1,  nome2;
        double valorPorHora1, valorPorHora2,total;
        int horas1, horas2;

        System.out.println("Dados do Primeiro Funcionário: \r\n");
        nome1 = sc.next();
        valorPorHora1 = sc.nextDouble();
        horas1=sc.nextInt();

        System.out.println("Dados do Segundo Funcionário: \r\n");
        nome2 = sc.next();
        valorPorHora2 = sc.nextDouble();
        horas2=sc.nextInt();

        total = valorPorHora1*horas1 + valorPorHora2 *horas2;
        System.out.printf("Total = R$%.2f%n",total);

    }
}
