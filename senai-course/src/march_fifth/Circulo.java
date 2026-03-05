package march_fifth;

public class Circulo extends Figura {
    public double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public double calcularArea(){
        // A classe Math usa a constante PI para fazer o calculo da área

        return Math.PI * raio * raio;
    }

}
