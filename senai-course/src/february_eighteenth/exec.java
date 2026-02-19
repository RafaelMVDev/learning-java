package february_eighteenth;
import february_eighteenth.Fruta;
import february_eighteenth.Estoque;



public class exec {
    public static void main(String[] args){
        Estoque estoque = new Estoque();
        EntradaDados entrada = new EntradaDados();
        System.out.println("--- Gerenciador de Estoque de Frutas --- ");

        int totalFrutas = 3;

        for (int i = 0; i < totalFrutas; i++){
            Fruta fruta = entrada.lerFruta();
            estoque.adicionarFruta(fruta);

        }

        estoque.gerarRelatorio();
        entrada.fecharScanner();
    }

}
