package march_fifth;

public class Arena {

    public static void main (String[] args){
        Personagem[] herois = {
                new Guerreiro("Conan"),
                new Mago("Gandalf"),
                new Arqueiro("Legolas"),
                new Hacker("BUGXXX")
        };

        // O alvo dos ataques será um monstro genérico

        Personagem monstro = new Personagem("Dragão",200,0) {
            // Isso é uma classe anônimo, um truque para não precisar criar outro arquivo.
            //Ela implementa o metodo abstrato na hora.

            @Override
            public void usarHabilidade(Personagem alvo) {
                System.out.println("Dragão não tem habilidades especiais.");
            }

            ;
        };
            System.out.println("======= A BATALHA VAI COMEÇAR! =======\n");

            monstro.receberDano(0); // Só para mostrar o status inicial

            System.out.println("");

            for (Personagem heroi : herois) {
                if (monstro.estaVivo()){
                    heroi.usarHabilidade(monstro);
                    System.out.println("---------------------");
                }
            }

            System.out.println("\n =========== FIM DA BATALHA! =======");
        }
    }

