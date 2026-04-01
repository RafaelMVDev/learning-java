package ex1_1st_april;

// ---  A CLASSE MÃE (Superclass) ----
public class Pessoa {
    //PROTECTED: O nome está seguro contra acessos externos
    //mas as classes filhas (como Professor e Aluno ) têm acesso a ela
    protected String nome;

    public Pessoa(String nome){
        this.nome = nome;
    }

    public void apresentar(){
        System.out.println("Olá, sou "  + this.nome);
    }

}
