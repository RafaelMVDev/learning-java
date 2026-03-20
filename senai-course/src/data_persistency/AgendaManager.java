package data_persistency;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class AgendaManager {
    private final String nomeArquivo;

    public AgendaManager(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public void salvarContatos(List<Contato> contatos) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomeArquivo))) {
            oos.writeObject(contatos);
        } catch (IOException e) {
            System.out.println("Erro ao salvar contatos: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public List<Contato> carregarContatos() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomeArquivo))) {
            return (List<Contato>) ois.readObject();
        } catch (FileNotFoundException e) {
            return new ArrayList<>(); // Retorna uma lista vazia se o arquivo ainda não existir
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Erro ao carregar contatos: " + e.getMessage());
            return new ArrayList<>();
        }
    }
}