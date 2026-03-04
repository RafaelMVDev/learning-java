package march_third;

public abstract class DispositivoDeMidia {
    protected String nomeDoDispositivo;

    public DispositivoDeMidia(String nome){
        this.nomeDoDispositivo = nome;
    }

    // Este é um metodo abstrato.Ele não tem implementação (sem {} ).
    // Ele FORÇA todas as classes filhas a criarem sua própria versão
    // do método 'reproduzir()'. Esté é o nosso "botão Play" conceitual.

    public abstract void reproduzir();

    // Classes abstratas também podem ter métodos concretos ( com implementação ),
    // que serão herdados normalmente por todas as filhas.

    public void desligar(){
        System.out.println(this.nomeDoDispositivo + " está desligando.");
    }
}
