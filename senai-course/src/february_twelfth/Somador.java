package february_twelfth;

public class Somador {
    private int[] numeros;
    public Somador(int[] numeros){
        this.numeros = numeros;
    }

    public int calcularSoma(){
        int soma = 0;
        for (int n: numeros){
            soma += n;
        }
        return soma;
    }

}
