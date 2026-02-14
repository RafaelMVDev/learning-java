package february_twelfth;

import java.util.Arrays;
import february_twelfth.Somador;

public class ex7 {
    public static void main(String[] args) {
        int[] lista = {1,2,3,4,5};
        Somador somador = new Somador(lista);
        System.out.println("Soma: " + somador.calcularSoma());


    }
}
