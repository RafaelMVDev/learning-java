package february_twenty.projeto_empresa;

public class Gerente extends Funcionario {

    // Atributo específico de um Gerente

    private String departamento;

    // Construtor da classe filha

    public Gerente(String nome, double salario, String departamento){
        // A palavra " super " chama o construtor da classe MÃE ( Funcionário ).
        // É obrigatório para inicializar os atributos que foram herdados (nome e salario)

        super(nome,salario);
        this.departamento = departamento;
    }

    // Método especifíco de um Gerente

    public void aprovarVerba(){
        System.out.println("O gerente " + this.nome + " do depto" + this.departamento + " aprovou a verba.");
    }
}
