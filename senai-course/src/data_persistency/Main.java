package data_persistency;

public class Main {
    public static void main(String[] args){
        //1. Inicialização
        String nomeArquivoEstoque = "estoque.txt";
        EstoqueManager manager = new EstoqueManager(nomeArquivoEstoque);

        //2. Carregar os dados persistidos do arquivo (se existirem)
        System.out.println("--- Tenando  carregar o estoque do arquivo... ---");
        List<Produto> estoque  = manager.carregarProdutos();
        System.out.println("Estoque carregado com " + estoque.size() + " produto(s).");
        System.out.println("\nEstado atual do estoque:");
        estoque.forEach(System.out::println);

        //3. Simular operações o sistema
        System.out.println("\n --- Realizando operações no sistema.. ---");

        // Se o estoque estiver vazio, vamos adicionar alguns produtos iniciais

        if(estoque.isEmpty()){
            System.out.println("Adicionando produtos iniciais...");
            estoque.add(new Produto(101, "Teclado Mecânico", 350.50,10));
            estoque.add(new Produto(102, "Mouse Gamer RGB", 150.75,25));
        }else{
            // Se já tinha produtos,  vamos apenas adicionar um novo e atualizar outro
            System.out.println("Adicionando um novo produto e atualizando um existente...");
            estoque.add(new Protduto(103, "Monitor 24 polegadas",899.99,8));
        }
    }
}
