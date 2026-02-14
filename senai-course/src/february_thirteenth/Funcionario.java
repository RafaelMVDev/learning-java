package february_thirteenth;

public class Funcionario {

    //Atributos
    public String nome;
    public double valorPorHora;
    public int horas;

    public Funcionario(String nome, double valorPorHora, int horas){
        this.nome = nome; // this faz referência á própria classe
        this.valorPorHora = valorPorHora;
        this.horas = horas;
    }

    // Métodos e Funções

    /* total() Retorna  calcula o salário do trabalhador baseado na
    quantidade de horas trabalhadas e seu valor pago por hora */

    public double total(){
        return valorPorHora * horas;
    }

}
