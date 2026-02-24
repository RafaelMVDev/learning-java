package february_twenty.projeto_empresa;

public class Empresa {
    public static void main(String[] args){
        // Criando um objeto Gerente
        Gerente gerente = new Gerente("Ana Silva",7500.0,"Financeiro");

        // Criando um objeto Desenvolvedor
        Desenvolvedor dev = new Desenvolvedor("João Costa", 5000, "Java");

        System.out.println("---- Dados do Gerente ---");
        System.out.println("Nome: " + gerente.getNome()); // Método herdado de Funcionario

        gerente.trabalhar(); // Método herdado de Funcionario
        gerente.aprovarVerba(); // Método específico de Gerente

        System.out.println("\n--- Dados do Desenvolvedor ---");
        System.out.println("Nome: " + dev.getNome()); // Método herdado de Funcionario
        dev.trabalhar(); // Método herdado de Funcionario
        dev.programar(); // Método específico de Desenvolvedor
    }
}
