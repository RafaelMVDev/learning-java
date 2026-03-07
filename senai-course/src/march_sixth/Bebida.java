package march_sixth;

// Esta classe abstrata é o noso "Molde". Não se pode criar uma "Bebida" genérica.
// Ela representa o CONCEITO de uma bebida que pode ser preparada.
public abstract class Bebida {

    // Este metodo é o "contrato". Ele não tem implementação
    // Ele OBRIGA toda classe que herdar de Bebida a ter seu próprio
    // metodo 'preparar()'.

    public abstract void preparar();
}
