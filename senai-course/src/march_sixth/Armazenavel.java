package march_sixth;


// *** ABSTRAÇÃO AQUI ***
// Uma interface é um contrato 100% abstrato.
// Ela define a AÇÃO de 'salvar', mas nenhuma classe sabe como fazer isso ainda.

public interface Armazenavel {
    void salvar(String nomeArquivo);
}
