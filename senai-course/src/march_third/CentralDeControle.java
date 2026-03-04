package march_third;

public class CentralDeControle{
    // Este é o nosso "Botão Play" polimórfico.
    // Ele aceita qualquer objeto que seja um DispositivoDeMidia.

    public void apertarPlay(DispositivoDeMidia dispositivo){
        System.out.println("Conectando ao dispositivo: " + dispositivo.nomeDoDispositivo);
        // O Java se encarrega de chamar a versão CORRETA do metodo reproduzir(),
        // Dependendo da forma real do objeto (TV,Celular ou Rádio).

        dispositivo.reproduzir();
        System.out.println("---");

    }

    public static void main(String[] args){
        // Criando a nossa central de controle.
        CentralDeControle controle = new CentralDeControle();

        //Criando os objetos com suas formas específicas.

        SmartTV tvDaSala = new SmartTV("TV da Sala", "Matrix");
        Celular meuCelular = new Celular("iPhone 15", "Stairway to Heaven", "Led Zeppelin");
        RadioAutomotivo radioDoCarro = new RadioAutomotivo("Rádio do Carro", 98.9);
        VideoGame VideoGame = new VideoGame("Xbox One","Red Dead Redemption 2");
        //USANDO O POLIMORFISMO:
        // O mesmo metodo 'apertarPlay' é chamado com objetos de tipos diferentes,
        // e cada um se comporta de sua própria maneira.

        controle.apertarPlay(tvDaSala);
        controle.apertarPlay(meuCelular);
        controle.apertarPlay(radioDoCarro);
        controle.apertarPlay(VideoGame);

        System.out.println("\n--- Demonstração com uma Lista de Dispostivos ---");

        // Criando uma lista que pode guardar QUALQUER DispositivoDeMidia.
        DispositivoDeMidia[] meusDispositivos = {tvDaSala, meuCelular, radioDoCarro, VideoGame};

        //Usando o for-each para apertar o play em todos os dispositivos

        for (DispositivoDeMidia dispositivo : meusDispositivos){
            // A cada volta, o Java identifica a forma e chama o metodo certo!
            dispositivo.reproduzir();
        }
    }

}
