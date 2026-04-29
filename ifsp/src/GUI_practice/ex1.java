package GUI_practice;
import javax.swing.*;

public class ex1 extends JFrame { /* Para criar a janela, precisamos herdar ele para o nosso objeto */
    public ex1(){ /* seta as configs da janela quando o objeto for inicializado */
        /* As funções setTitle e demais são herdados do JFrame, e por isso posso usa-los aqui */
        setTitle("Primeira Janela - LBP2");
        setSize(800,600); /* Tamanho da tela */
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); /*  Oq fazer quando o usuário fechar a tela */
        setLocationRelativeTo(null); /* Posição da tela - null deixa centralizado */
    }

    public static void main(String[] args){
        /* Uso de lambda function em " () -> {}" para chamr uma thread q cria a nova janela */
        SwingUtilities.invokeLater(() -> {
            ex1 novaJanela = new ex1();
            novaJanela.setVisible(true);
        });

        //todo SwingUtilities.invokeLater() - enfileirar uma tarefa (Runnable) para ser executada assincronamente
        // na Event Dispatch Thread (EDT). Ele garante a segurança de thread (thread-safety)
        // Assim o código é mais rápido (inicializa o programa enquanto inicializa o swing em outra thread) e
        // Impede o programa de quebrar
    }

}
