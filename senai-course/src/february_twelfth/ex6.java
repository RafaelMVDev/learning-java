package february_twelfth;
import java.util.Arrays;

public class ex6 {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5};


        int soma = Arrays.stream(numeros).sum();
        System.out.println("Soma: " + soma);

    }
}
