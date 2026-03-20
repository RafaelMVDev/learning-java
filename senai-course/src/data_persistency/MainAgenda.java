package data_persistency;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MainAgenda {
    private static final AgendaManager manager = new AgendaManager("agenda.txt");
    private static final Scanner scanner = new Scanner(System.in);
    private static List<Contato> agenda;

    public static void main(String[] args) {
        agenda = manager.carregarContatos();
        System.out.println("Bem-vindo à sua Agenda de Contatos Digital!");

        int opcao = 0;
        while (opcao != 5) {
            exibirMenu();
            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
                scanner.nextLine(); // Limpa o buffer

                switch (opcao) {
                    case 1: adicionarContato(); break;
                    case 2: listarContatos(); break;
                    case 3: buscarContato(); break;
                    case 4: removerContato(); break;
                    case 5: System.out.println("Salvando agenda e saindo..."); break;
                    default: System.out.println("Opção inválida!");
                }
            } else {
                System.out.println("Por favor, digite um número.");
                scanner.next(); // Descarta a entrada inválida
            }
        }
        manager.salvarContatos(agenda);
        System.out.println("Agenda salva com sucesso. Até mais!");
        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\n--- AGENDA DE CONTATOS ---");
        System.out.println("1. Adicionar novo contato");
        System.out.println("2. Listar todos os contatos");
        System.out.println("3. Buscar contato por nome");
        System.out.println("4. Remover contato");
        System.out.println("5. Salvar e Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void adicionarContato() {
        System.out.println("\n--- Adicionar Contato ---");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        // Verifica se o nome já existe (ignorando maiúsculas/minúsculas)
        if (agenda.stream().anyMatch(c -> c.getNome().equalsIgnoreCase(nome))) {
            System.out.println("Erro: Já existe um contato com este nome.");
            return;
        }

        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();

        agenda.add(new Contato(nome, telefone, email));
        System.out.println("Contato adicionado com sucesso!");
    }

    private static void listarContatos() {
        System.out.println("\n--- Seus Contatos ---");
        if (agenda.isEmpty()) {
            System.out.println("Nenhum contato na agenda.");
        } else {
            agenda.forEach(System.out::println);
        }
    }

    private static void buscarContato() {
        System.out.println("\n--- Buscar Contato ---");
        System.out.print("Digite o nome ou parte do nome para buscar: ");
        String termoBusca = scanner.nextLine().toLowerCase();

        List<Contato> resultados = agenda.stream()
                .filter(c -> c.getNome().toLowerCase().contains(termoBusca))
                .collect(Collectors.toList());

        if (resultados.isEmpty()) {
            System.out.println("Nenhum contato encontrado com o termo '" + termoBusca + "'.");
        } else {
            System.out.println("Resultados da busca:");
            resultados.forEach(System.out::println);
        }
    }

    private static void removerContato() {
        System.out.println("\n--- Remover Contato ---");
        System.out.print("Digite o nome exato do contato a ser removido: ");
        String nomeParaRemover = scanner.nextLine();

        // Utilizando o método removeIf sugerido no slide 11 [cite: 48]
        boolean removido = agenda.removeIf(c -> c.getNome().equalsIgnoreCase(nomeParaRemover));

        if (removido) {
            System.out.println("Contato removido com sucesso!");
        } else {
            System.out.println("Contato não encontrado.");
        }
    }
}