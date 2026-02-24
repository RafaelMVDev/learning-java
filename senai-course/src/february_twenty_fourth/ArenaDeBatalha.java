package february_twenty_fourth;

public class ArenaDeBatalha {
    public static void main(String[] args) {
        // 1. Criação dos Personagens
        Heroi aragorn = new Heroi("Aragorn", 100,15);
        Monstro orc = new Monstro("Orc Grunt", 70,10,"Golpe de Clava");

        System.out.println("--- A BATALHA COMEÇA ! ----");
        aragorn.exibirStatus();
        orc.exibirStatus();
        System.out.println("------------------------------\n");

        int turno = 1;

        // 2. LOOP DA BATALHA
        // A batalha continua enquanto ambos (herói E monsto) estiverem vivos.

        while(aragorn.estaVivo() && orc.estaVivo()){
            System.out.println("---- TURNO " + turno + " ----");

            // Herói ataca o monstro
            aragorn.atacar(orc);

            //Verifica se o monstro sobrevivou antes de atacar de volta

            if(orc.estaVivo()){
                orc.atacar(aragorn);
            }

            //Exemplo de uso da habilidade especial do herói (lógica simples)
            // Se a vida do herói ficar baixa, ele tenta usar uma poção.

            if (aragorn.estaVivo() && aragorn.pontosDeVida < 40) {
                System.out.println("\nVida do herói está baixa!");
                aragorn.usarPocao();
            }

            System.out.println("----------------------\n");
            turno ++;
        }
        //3. FIM DA BATALHA
        System.out.println("--- A BATALHA TEMRINOU! ---");
        if (aragorn.estaVivo()) {
            System.out.println(aragorn.nome + " é o vencedor!");
        } else {
            System.out.println(orc.name + " é o vencedor!");
        }

        aragorn.exibirStatus();
        orc.exibirStatus();
    }

}
