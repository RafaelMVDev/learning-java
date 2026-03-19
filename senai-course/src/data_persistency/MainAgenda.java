package data_persistency;

public class MainAgenda {
    private static final AgendaManager manager = new AgendaManager("agenda.txt");
    private static final Scanner scaner = new Scanner(System.in);
    private static List<Contato> agenda;

    public static void main(String[] args){
        agenda = manager.carregarContatos();
        System.out.println("Bem-vindo à sua Agenda de Contatos Digital!");

        int opcao = 0;
        while (opcao != 5){
            exibirMenu();
            if (scanner.hasNextInt()){
                opcao = scanner.nextInt();
                scanner.nextLine(); // Limpa o buffer

                switch (opcao) {
                    case1:
                    adicionarContato() break;
                    case2:
                    listarContato() break;
                    case3:
                    buscarContato() break;
                    case4:
                    removerContato() break;
                    case5:
                    System.out.println("Salvando agenda e saindo...");
                    break;
                    default:
                        System.out.println("Opção inválida!");
                        break;
                }
            } else{
                System.out.println("Por favor, digite um número.");
                scanner.next(); //Descarta a entrada inválida
            }
        }
    }
    private static void exibirMenu(){
        System.out.println("\n--- AGENDA DE CONTATOS ---");
        System.out.println("1. Adicionar novo contato");
        System.out.println("2. Listar todos os contatos");
        System.out.println("3. Buscar contato por nome");
        System.out.println("4. Remover contato");
        System.out.println("5. Sair e Salvar");
        System.out.println("Escolha uma opção");

    }

    private static void adicionarContato(){
        System.out.println("\n--- Adicionar Contato ---");
        System.out.println("Nome: ");
        String nome = scanner.nextLine();

        //Verifica se o nome já existe (ignorando maiúsculas/minúsculas)
        if (agenda.stream().anyMatch(c -> c.getNome().equalsIgnoreCase(nome))){
            System.out.println("Erro: Já existe um contato com este nome.");
            return;
        }
        System.out.println("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.println("Email: ");
        String email = scanner.nextLine();

        agenda.add(new Contato(nome,telefone,email));
        System.out.println("Contato adicionado com sucesso!");
    }

    private static void listarContatos(){
        System.out.println("\n--- Seus Contatos---");
        if (agenda.isEmpty()){
            System.out.println("Nenhum contato na agenda.");
        } else {
            agenda.forEach(System.out::println);
        }
    }

    private static void buscarContato(){
        System.out.println("\n--- Buscar Contato ---");
        System.out.println("Digite o nome ou parte do nome para buscar: ");
        String termoBusca = scanner.nextLine().toLowerCase();

        List<Contato> resultados = agenda.stream()
                .filter(c -> c.getNome().toLowerCase().contains(termoBusca))
                .collect(Collectors.toList());
        if (resultados.isEmpty()){
            System.out.println("Nenhum contato encontrado com o termo '" + termoBusca + "'.");
        } else{
            System.out.println("Resultados da busca: ");
            resultados.forEach(System.out::println);
        }
    }

    private static void removerContato(){
        System.out.println("\n--- Remover Contato ---");
        System.out.println("Digite o nome exato do contato a ser removido: ");
        String nomeParaRemover = scanner.nextLine();

        //removeif é um metodo eficiente para remover itens de uma lista com base em uma condição

        boolean removida = agenda.removeif(contato -> contato.getNome().equalsIgnoreCase(nomeParaRemover));

        if (removido){
            System.out.println("Contato '" + nomeParaRemover + "' removido com sucesso.");
        } else {
            System.out.println("Nenhum contato com o nome '" + nomeParaRemover + "' foi encontrado.");
        }
    }

}
