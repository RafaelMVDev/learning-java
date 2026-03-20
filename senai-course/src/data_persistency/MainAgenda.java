package data_persistency;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MainAgenda {
    private static final AgendaManager manager = new AgendaManager("agenda.txt"); // [cite: 36]
    private static final Scanner scanner = new Scanner(System.in); // [cite: 36]
    private static List<Contato> agenda; // [cite: 36]

    public static void main(String[] args) {
        agenda = manager.carregarContatos(); // [cite: 36]
        System.out.println("Bem-vindo à sua Agenda de Contatos Digital!"); // [cite: 36]

        int opcao = 0; // [cite: 36]
        while (opcao != 5) { // [cite: 36]
            exibirMenu(); // [cite: 36]
            if (scanner.hasNextInt()) { // [cite: 36]
                opcao = scanner.nextInt(); // [cite: 36]
                scanner.nextLine(); // Limpa o buffer [cite: 36]

                switch (opcao) { // [cite: 36]
                    case 1: adicionarContato(); break; // [cite: 36]
                    case 2: listarContatos(); break; // [cite: 36]
                    case 3: buscarContato(); break; // [cite: 36]
                    case 4: removerContato(); break; // [cite: 36]
                    case 5: System.out.println("Salvando agenda e saindo..."); break; // [cite: 36]
                    default: System.out.println("Opção inválida!"); // [cite: 39]
                }
            } else {
                System.out.println("Por favor, digite um número."); // [cite: 39]
                scanner.next(); // Descarta a entrada inválida [cite: 39]
            }
        }
        manager.salvarContatos(agenda); // [cite: 39]
        System.out.println("Agenda salva com sucesso. Até mais!"); // [cite: 39]
        scanner.close(); // [cite: 39]
    }

    private static void exibirMenu() {
        System.out.println("\n--- AGENDA DE CONTATOS ---"); // [cite: 39]
        System.out.println("1. Adicionar novo contato"); // [cite: 39]
        System.out.println("2. Listar todos os contatos"); // [cite: 39]
        System.out.println("3. Buscar contato por nome"); // [cite: 39]
        System.out.println("4. Remover contato"); // [cite: 39]
        System.out.println("5. Salvar e Sair"); // [cite: 39]
        System.out.print("Escolha uma opção: "); // [cite: 39]
    }

    private static void adicionarContato() {
        System.out.println("\n--- Adicionar Contato ---"); // [cite: 43]
        System.out.print("Nome: "); // [cite: 43]
        String nome = scanner.nextLine(); // [cite: 43]

        // Verifica se o nome já existe (ignorando maiúsculas/minúsculas) [cite: 43]
        if (agenda.stream().anyMatch(c -> c.getNome().equalsIgnoreCase(nome))) { // [cite: 43]
            System.out.println("Erro: Já existe um contato com este nome."); // [cite: 43]
            return; // [cite: 43]
        }

        System.out.print("Telefone: "); // [cite: 43]
        String telefone = scanner.nextLine(); // [cite: 43]
        System.out.print("Email: "); // [cite: 43]
        String email = scanner.nextLine(); // [cite: 43]

        agenda.add(new Contato(nome, telefone, email)); // [cite: 43]
        System.out.println("Contato adicionado com sucesso!"); // [cite: 43]
    }

    private static void listarContatos() {
        System.out.println("\n--- Seus Contatos ---"); // [cite: 43]
        if (agenda.isEmpty()) { // [cite: 43]
            System.out.println("Nenhum contato na agenda."); // [cite: 43]
        } else {
            agenda.forEach(System.out::println); // [cite: 43]
        }
    }

    private static void buscarContato() {
        System.out.println("\n--- Buscar Contato ---"); // [cite: 46]
        System.out.print("Digite o nome ou parte do nome para buscar: "); // [cite: 46]
        String termoBusca = scanner.nextLine().toLowerCase(); // [cite: 46]

        List<Contato> resultados = agenda.stream() // [cite: 46]
                .filter(c -> c.getNome().toLowerCase().contains(termoBusca)) // [cite: 46]
                .collect(Collectors.toList()); // [cite: 46]

        if (resultados.isEmpty()) { // [cite: 46]
            System.out.println("Nenhum contato encontrado com o termo '" + termoBusca + "'."); // [cite: 46]
        } else {
            System.out.println("Resultados da busca:"); // [cite: 46]
            resultados.forEach(System.out::println); // [cite: 46]
        }
    }

    private static void removerContato() {
        System.out.println("\n--- Remover Contato ---"); // [cite: 46]
        System.out.print("Digite o nome exato do contato a ser removido: "); // [cite: 46]
        String nomeParaRemover = scanner.nextLine(); // [cite: 46]

        // Utilizando o método removeIf sugerido no slide 11 [cite: 48]
        boolean removido = agenda.removeIf(c -> c.getNome().equalsIgnoreCase(nomeParaRemover)); // [cite: 48]

        if (removido) {
            System.out.println("Contato removido com sucesso!");
        } else {
            System.out.println("Contato não encontrado.");
        }
    }
}