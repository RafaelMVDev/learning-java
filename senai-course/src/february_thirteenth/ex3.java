package february_thirteenth;

import java.util.Scanner;
import february_thirteenth.Funcionario;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declarando as variavéis do tipo Funcionário
        Funcionario f1,f2;



        System.out.println("Dados do Primeiro Funcionário: \r\n");
        // Atribuindo valores de entrada aos atributos do objeto f1

        // Criando o registro do funcionário 1
        f1 = new Funcionario(sc.next(),sc.nextDouble(),sc.nextInt());

        // Instanciando objeto da classe funcionário para o registro do funcionário 2
        System.out.println("Dados do Segundo Funcionário: ");

        // Instanciando objeto da classe funcionário para o registro do funcionário 2
        f2 = new Funcionario(sc.next(),sc.nextDouble(),sc.nextInt());


        // .total() retorna valor por hora * horas trabalhadas de cada funcionário
        double total = f1.total() + f2.total(); //
        System.out.printf("Total = %.2f%n", total);
    }
}
