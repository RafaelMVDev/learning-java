
package february_twenty_fifth;
import java.util.InputMismatchException; // Classe para verificação de erros de entrada
import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // ---- DADOS DO BANCO ---
        // Agora criamos instâncias das classes específicas.

        Cliente cliente1 = new Cliente("Clark Kent", "111.222.333-44");
        Conta conta1 = new ContaCorrente(cliente1); // Clark tem uma Conta Corrente
        Conta conta_salario = new ContaSalario(cliente1);
        conta_salario.depositar(5000);
        conta1.depositar(1500.0);

        Cliente cliente2  = new Cliente("Bruce Wayne", "888.999.000-11");
        Conta conta2 = new ContaPoupanca(cliente2); //Bruce tem uma Conta Poupança
        Conta conta_empresa = new ContaSalario(cliente2);
        conta2.depositar(100000.0);


        // Colocamos as contas em um array do tipo da superclasse ( Conta )>
        // Isso é Polimorfismo: o array pode guardar qualquer objeto que SEJA UMA Conta.

        Conta[] contasDoBanco = {conta1,conta_salario,conta2,conta_empresa};
        Conta contaAtiva = contasDoBanco[1];

        int opcao = 0;

        while(opcao != 10){
            System.out.println("\n--- CAIXA ELETRÔNICO ZZ BANK ---");
            System.out.println("Bem-vindo(a), " + contaAtiva.getNomeTitular() + " | Conta: " + contaAtiva.getClass().getSimpleName());
            System.out.println("1- Consultar Saldo");
            System.out.println("2- Depositar");
            System.out.println("3- Sacar");
            System.out.println("4- Transferir");
            System.out.println("5- Trocar de Conta ( Login )");


            // --- OPÇÕES ESPECÍFICAS DE CADA CONTA ----
            // O operador 'instanceof' verifica o tipo real do objeto.

            if(contaAtiva instanceof ContaCorrente){
                System.out.println("6 - Cobrar Taxa de Manutenção");
            }

            if (contaAtiva instanceof ContaPoupanca){
                System.out.println("7- Fazer Render Juros");
            }

            System.out.println("8 - Fazer Pix");
            System.out.println("9 - Adicionar Chave Pix");
            System.out.println("10 - Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    contaAtiva.exibirDados();
                    break;
                case 2:
                    if (contaAtiva instanceof ContaSalario) {
                        System.out.print("Método inválido para conta salário: ");
                    }else{
                        System.out.print("Digite o valor para depositar: ");
                        contaAtiva.depositar(scanner.nextDouble());
                    }

                    break;
                case 3:
                    System.out.print("Digite o valor para sacar: ");
                    contaAtiva.sacar(scanner.nextDouble());
                break;
                case 4:
                    System.out.println("Digite o número da conta destino: ");
                    int numContaDestino = scanner.nextInt();
                    Conta contaDestino = null;
                    for (Conta c : contasDoBanco) if (c.getNumero() == numContaDestino) contaDestino = c;

                    if (contaDestino != null && contaDestino != contaAtiva) {
                        if (contaAtiva instanceof ContaSalario){

                            ((ContaSalario) contaAtiva).transferir_salario(contaDestino);
                        }else{
                            System.out.print("Digite o valor para transferir: ");
                            contaAtiva.transferir(contaDestino, scanner.nextDouble());
                        }



                    } else {
                        System.out.println("Conta destino inválida ou igual à origem.");
                    }
                    break;
                case 5:
                    System.out.println("\n--- CONTAS DISPONÍVEIS ---");
                    for (Conta c : contasDoBanco) {
                        System.out.println("Nº " + c.getNumero() + " - " + c.getClass().getSimpleName() + " - " + c.getNomeTitular());
                    }

                    System.out.print("Digite o número da conta desejada: ");
                    int numContaLogin = scanner.nextInt();
                    boolean encontrada = false;
                    for (Conta c : contasDoBanco) {
                        if (c.getNumero() == numContaLogin){
                            contaAtiva = c;
                            encontrada = true;
                            break;
                        }

                    }
                    if (encontrada) System.out.println("Login efetuado com sucesso!");
                    else System.out.println("Conta não encontrada.");
                    break;
                case 6:
                    if (contaAtiva instanceof ContaCorrente) {
                        //É preciso fazer um "cast" para acessar o metodo específico
                        // Dizemos aoo compilador: "Trate este objeto como uma contaCorrente".
                        ((ContaCorrente) contaAtiva).cobrarTaxa();
                    } else {
                        System.out.println("Opção válida apenas para Contas Correntes.");
                    }
                    break;
                case 7:
                    if (contaAtiva instanceof ContaPoupanca) {
                        //Fazendo o "cast" para ContaPoupanca
                        System.out.println("6 - Cobrar Taxa de Manutenção");
                        ((ContaPoupanca) contaAtiva).renderJuros();
                    } else {
                        System.out.println("Opção válida apenas para Contas Poupança.");
                    }

                case 8: {
                    while (true){
                        scanner.nextLine();
                        System.out.print("\nDigite a chave pix do destinatário [S para sair]: ");
                        String chave_pix = scanner.nextLine();
                        if (chave_pix.equals("S")){
                            break;
                        }
                        boolean chaveExiste = false;
                        for (Conta c : contasDoBanco) {

                            Conta conta = c;
                            chaveExiste = conta.chaveExiste(chave_pix);
                            if (chaveExiste) {
                                System.out.println("Digite o valor para transferir: ");
                                c.depositar(scanner.nextDouble());

                                System.out.println("Transferência realizada com sucesso! ");
                                break;
                            }
                        }
                        if (!chaveExiste) {
                            System.out.println("Chave não encontrada!Tente novamente: ");
                        }

                    }
                }
                case 9:
                    scanner.nextLine();
                    System.out.print("\n Digite a chave a ser adicionada: ");

                    Conta conta =  contaAtiva;
                    conta.adicionarChave(scanner.nextLine());
                    System.out.println("Listando chaves == ");
                    conta.listarChaves();


                case 10:
                    System.out.println("\n Obrigado por usar o ZZ  Bank. Volte sempre!");
                    break;
                default:
                    System.out.println("\n Opção inválida.");
                    break;
                }
            } catch(InputMismatchException e){
                System.out.println(("Erro:Por favor digite apenas números."));
                scanner.next();
            }

        }
        scanner.close();
    }
}

//Downcasting (Manual/Explícito): Converter uma superclasse para uma subclasse. É necessário quando você tem uma referência da superclasse mas precisa acessar métodos específicos da subclasse.
//java
Animal a = new Cachorro();
Cachorro c = (Cachorro) a; // Explícito: Necessário para forçar o tipo

