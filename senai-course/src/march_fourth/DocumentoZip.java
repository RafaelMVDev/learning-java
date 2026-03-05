package march_fourth;

public class DocumentoZip extends Documento{
    protected String nome;

    public DocumentoZip(String nome) {
        super(nome);
    }

    public void unzipar() {
        System.out.println("Descompactando documento...");
    }

    public void imprimir(){
            unzipar();
            System.out.println(nome +"Está pronto para imprimir!");
    };
}
