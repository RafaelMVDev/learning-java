package ex1_1st_april;

public class Main {
    public static void main (String[] args){
        // Testando a classe Mãe (Generalização)

        Pessoa p1 = new Pessoa("Carlos");
        p1.apresentar();

        // Testando a classe Filha (Especialização)
        Professor prof1 =  new Professor("Carlos","Informática");
        prof1.apresentar();

    }
}
