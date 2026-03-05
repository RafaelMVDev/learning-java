package march_fourth;

import javax.print.Doc;

public class Impressora {
    public static void main(String[] args){
        Documento[] filaDeImpressao = {
                new Relatorio("Vendas_Setembro.pdf"),
                new Foto("ferias_na_praia.jpg"),
                new Relatorio("Balancete_Anual.docx"),
                new DocumentoZip("img_4k.zip")

        };

        System.out.println("--- Iniciando Fila de Impressão ---");

        // **** O POLIMORFISMO ACONTECE AQUI ****
        // Para a impressora, tudo é apenas um 'Documento'. Ela envia
        // O comando 'imprimir()' e o próprio objeto (Relatorio ou Foto)
        // Se encarrega de executar a impressão de maneira correta.

        for (Documento doc: filaDeImpressao){
            doc.imprimir();
        }
    }
}
