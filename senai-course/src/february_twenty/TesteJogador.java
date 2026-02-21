package february_twenty;

public class TesteJogador {
    public static void main(String[] args) {
        System.out.println("----- Simulando uma Parida -----");
        Jogador heroi = new Jogador("Goku");

        // Começando a partida
        System.out.println("\n Derrotando um inimigo...");
        heroi.adicionarPontos(50);

        // Entrando em uma batalha
        System.out.println("\n Recebendo um ataque forte...");
        heroi.receberDano(40); // Vida = 60 aqui

        // Usando um item de cura
        System.out.println("\n Usando uma poção...");
        heroi.receberCura(25); // Vida == 85

        // Tentativa de curar além do máxim
        System.out.println("\nUsando outra poção forte...");
        heroi.receberCura(30); // Não regenra, vida ficaria em 115: Lógica barra

        // Recebendo dano letal

        System.out.println("\n Recbendo um ataque devastador...");
        heroi.receberDano(150); // Lógica impede vida de ir negativo -> vai pra 0
        // Tentando manipular a vida diretamente
        // Causará erro de compilação - vida é private e nn pode ser manipulada diretamente
        //heroi.vida = 9999;

        // Revivendo

        heroi.ressuscitar();

    }
}


