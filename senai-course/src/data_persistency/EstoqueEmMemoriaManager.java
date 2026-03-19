package data_persistency;
import java.sql.Array;
import java.util.ArrayList;
public class EstoqueEmMemoriaManager {
    // Nosso *banco de dados" volátil.
    //Está lista só existe enquanto o objeto EstoqueEmMemoriaManager existir na RAM.

    private final List<Produto> estoqueInterno;

    public EstoqueEmMemoriaManager() {
        //Quando o gerenciador é criado, a lista é inicializada vazia.
        this.estoqueInterno = new ArrayList<>();
        System.out.println("-> (Gerenciador de Memória Criado: O estoque está vazio)");
    }
    /**
     * Adiciona um produto à lista em memória
     * param produto O produto a ser "salvo".
     */

    public void salvar(Produto produto){
        System.out.println("-> Salvando '" + produto.getNome() + "' na memória...");
        this.estoqueInterno.add(produto);
    }

    /**
     * Retorna uma cópia de toda a lista de produtos em memória.
     * @return A lista de todos os produtos
     */

    public List<Produto> ListarTodos(){
        return new ArrayList<>(this.estoqueInterno); // Retorna uma cópia para proteger a lista original
    }

    /**
     * Retorna uma cópia de toda a lista de produtos em memória.
     * @param codigo O código a ser buscado.
     * @return Um Optional contendo o produto se encontrado, ou vazio caso contrário.
     */

    public Optional<Produto> buscarPorCodigo(int codigo){
        return this.estoqueInterno.stream().filter(p -> p.getCodigo() == codigo).findFirst();
    }

}
