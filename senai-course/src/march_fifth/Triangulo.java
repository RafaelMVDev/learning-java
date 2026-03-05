package march_fifth;

public class Triangulo extends Figura{
    private double altura;
    private double base;

    public Triangulo(double altura, double base){
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double calcularArea(){
        return (base * altura)/2;
    }
}
