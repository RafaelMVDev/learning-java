package ex_interface;


interface ImpostoStrategy {
    double calcular(double valor);
}

class ICMS implements ImpostoStrategy {
    double taxa = 0.18;
    public double calcular(double valor){
        return valor + valor * this.taxa;
    }
}

class Iss implements ImpostoStrategy {
    double taxa = 0.05;
    public double calcular(double valor){
        return valor + valor * this.taxa;
    }
}


class CalculadoraDeImposto{
    private ImpostoStrategy tipoImposto;

    public void setImposto(ImpostoStrategy tipoImposto){
        this.tipoImposto = tipoImposto;
    }

    public double calcular(double valor){
        return this.tipoImposto.calcular(valor);
    };

}

public class Imposto {
    public static void main(String[] args){
        double vl = 100;
        CalculadoraDeImposto calc = new CalculadoraDeImposto();
        Iss impostoIss = new Iss();

        calc.setImposto(impostoIss);
        System.out.println("Valor antes do imposto: " + vl +"\nApós o imposto: " + calc.calcular(vl));

    }
}

