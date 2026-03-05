package march_fifth;

import java.util.Scanner;
import java.util.InputMismatchException;

public class CalculadoraInterativa {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        while (opcao != 3) {
            System.out.println("\n--- CALCULADORA DE ÁREAS ---");
            System.out.println("1- Criar um Retângulo");
            System.out.println("2- Criar um Círculo");
            System.out.println("3- Criar um Quadrado");
            System.out.println("4- Criar um Triângulo");
            System.out.println("5- Sair");
            System.out.print("Escolha uma opção: ");

            // A variável 'figuraDoUsuario' é do tipo da superclasse 'Figura'.
            // Ela pode "assumir a forma" de qualquer classe filha

            Figura figuraDoUsuario = null;

            try {
                opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("Digite a base do retângulo: ");
                        double base = scanner.nextDouble();
                        System.out.println("Digite a altura do retângulo: ");
                        double altura = scanner.nextDouble();

                        // A variável 'figuraDoUsuario' AGORA TEM A FORMA de um Retangulo.

                        figuraDoUsuario = new Retangulo(base, altura);
                        break;

                    case 2:
                        System.out.print("Digite o raio do círculo: ");
                        double raio = scanner.nextDouble();
                        // A variavél  'figuraDoUsuario' AGORA TEM A FORMA  de um Circulo
                        figuraDoUsuario = new Circulo(raio);
                        break;
                    case 3:
                        System.out.print("Digite a altura do quadrado: ");
                        double lado = scanner.nextDouble();
                        // A variavél  'figuraDoUsuario' AGORA TEM A FORMA  de um Quadrado
                        figuraDoUsuario = new Quadrado(lado);
                        break;
                    case 4:
                        System.out.print("Digite a altura do triângulo: ");
                        double altura_tri = scanner.nextDouble();
                        System.out.print("Agora a medida da base: ");
                        double base_tri = scanner.nextDouble();
                        // A variavél  'figuraDoUsuario' AGORA TEM A FORMA  de um Quadrado
                        figuraDoUsuario = new Triangulo(base_tri,altura_tri);
                        break;
                    case 5:
                        System.out.println("Até logo!");
                        continue; // Pula para a próxima iteração do while, que vai parar.
                    default:
                        System.out.println("Opção inválida!");
                        break;

                }

                // *** O POLIMORFISMO ACONTECE AQUI ***
                // Se uma igura foi criada ( não importa qual)...

                if (figuraDoUsuario != null){
                    //... está ÚNICA linha de código funciona para AMBOS os casos.
                    // O Java sabe se deve chamar o 'calcularArea' do Retangulo ou do Circulo,
                    // com base no objeto que foi criadd pelo usuário.

                    System.out.println("-----------------------------------------");
                    // String.format formata a quantidade de números depois da virgula
                    System.out.println("A área da sua figura é: " + String.format("%.2f", figuraDoUsuario.calcularArea()));
                    System.out.println("-----------------------------------------");

                }
            } catch(InputMismatchException e) {
                System.out.println("Erro: Por favor, digite um valor númerico válido.");
                scanner.next(); // Limpa o buffer do scanner
            }
        }
        scanner.close();
    }
}
