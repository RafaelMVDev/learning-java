package february_twenty_fifth;
import java.util.ArrayList;

public class ContaPix extends Conta{
    // Chaves pix
    private ArrayList<String> chaves_pix = new ArrayList<>();

    public ContaPix(Cliente titular){
        super(titular);
    }

    public void adicionarChave(String chave){
        this.chaves_pix.add(chave);
    }

    public void removerChave(String chave_goal){
        // Checa se  a chave existe, se existir, remove
        for (String chave : this.chaves_pix) {
            if (chave.equals(chave_goal)){
                this.chaves_pix.remove(chave);
            }
        }
    }

    public boolean chaveExiste(String chave_goal){

        for (String c : this.chaves_pix ){
            if (c.equals(chave_goal)){
                return true;
            }
        }
        return false;
    }

    public void listarChaves(){
        System.out.println("====== Chaves ======");
        for (String chave : this.chaves_pix){
            System.out.println(chave);
        }
    }


    public void fazerPix(Conta c, double valor){
        c.depositar(valor);
    }
}
