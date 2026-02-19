package february_eighteenth;
import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Fruta> frutas;


    public  Estoque(){
        frutas = new ArrayList<>();
    }
    public void adicionarFruta(Fruta fruta){
        frutas.add(fruta);
    }

    public int contarEstoqueBaixo(){
        int contador = 0;
        for (Fruta fruta: frutas){
            if (fruta.isEstoqueBaixo()){
                contador++;
            }
        }
        return contador;
    }

    public void gerarRelatorio(){
        System.out.println("\n--- Relatório de Estoque ---");
        for (Fruta fruta: frutas){
            if (fruta.isEstoqueBaixo()){
                System.out.println("ALERTA: A fruta '" + fruta.getNome() + "' está com estoque baixo! Apenas " + fruta.getQuantidade() + "unidades.");
            }
        }
        System.out.println("Total de frutas com estoque baixo: " + contarEstoqueBaixo());
    }

}
