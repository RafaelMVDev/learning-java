package february_thirteenth;

import java.util.Scanner;

public class registro_funcionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declarando as variavéis do tipo Funcionário
        String nome;
        double valorPorHora;
        int horas;
        Funcionario f1,f2;

        System.out.println("Dados do Primeiro Funcionário: \r\n");
        // Valores de entrada pro funcionário 1
        nome = sc.next();
        valorPorHora = sc.nextDouble();
        horas = sc.nextInt();

        // Criando o registro do funcionário 1
        f1 = new Funcionario(nome, valorPorHora,horas);

        // Instanciando objeto da classe funcionário para o registro do funcionário 2
        System.out.println("Dados do Segundo Funcionário: ");

        // Valores de entrada pro funcionário 1
        nome = sc.next();
        valorPorHora = sc.nextDouble();
        horas = sc.nextInt();

        // Instanciando objeto da classe funcionário para o registro do funcionário 2
        f2 = new Funcionario(nome, valorPorHora,horas);

        // .total() retorna valor por hora * horas trabalhadas de cada funcionário
        double total = f1.total() + f2.total(); //
        System.out.printf("Total = R$%.2f%n", total);
    }
}
