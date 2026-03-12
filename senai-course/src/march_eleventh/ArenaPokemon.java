package march_eleventh;

import java.util.Random;
import java.util.Scanner;
public class ArenaPokemon {
    public static void main(String[] args) throws InterruptedException{
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Lista de Pokémon

        Pokemon[] pokemonsDisponiveis = {
                new Charmander(),
                new Squirtle(),
                new Bulbasaur(),
                new Pikachu(),
                new Geodude()
        };
        System.out.println("---- BEM-VINDO Á ARENA POKÉMON! ---");
        System.out.println("Escolha seu Pokémon: ");

        for (int i = 0 ; i < pokemonsDisponiveis.length; i++){
            System.out.println((i+ 1) + " - " + pokemonsDisponiveis[i].getNome());
        }
        int escolha = scanner.nextInt() - 1;
        Pokemon jogador = pokemonsDisponiveis[escolha];

        Pokemon inimigo = pokemonsDisponiveis[random.nextInt(pokemonsDisponiveis.length)];

        // Garante que  o inimigo não seja o mesmo que o jogador

        while(inimigo.getNome().equals(jogador.getNome())){
            inimigo = pokemonsDisponiveis[random.nextInt(pokemonsDisponiveis.length)];
        }

        System.out.println("\n Você escolheu" + jogador.getNome() + "!");
        System.out.println("\n Seu oponente será" + inimigo.getNome() + "!");
        System.out.println("\nQUE A BATALHA COMECE!");

        Thread.sleep(2000);

        while (jogador.estaVivo() && inimigo.estaVivo()){
            System.out.println("\n--- SEU TURNO ---");
            System.out.println("Status: " + jogador.getNome() + " (HP: " + jogador.getVida() + ") " +
                "vs" + inimigo.getNome() + " (HP: " + inimigo.getVida() + ")");
            System.out.println("O que " + jogador.getNome() + " vai fazer?");

            jogador.listarAtaques();
            int ataqueEscolhido = scanner.nextInt();
            jogador.atacar(inimigo,ataqueEscolhido);

            if (!inimigo.estaVivo()) break;
            Thread.sleep(2000);

            System.out.println("\n--- TURNO DO INIMIGO --=");
            int ataqueInimigo = random.nextInt(2) + 1; // Ataque aleatório (1 ou 2 )

            inimigo.atacar(jogador,ataqueInimigo);

            if(!jogador.estaVivo()) break;
            Thread.sleep(2000);
        }

        System.out.println("\n--- FIM DA BATALHA ---");
        if (jogador.estaVivo()){
            System.out.println("Parabéns, você venceu!");

        } else{
            System.out.println("Que pena, você foi derrptado!");
        }

        scanner.close();
    }
}
