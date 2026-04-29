package GUI_practice;
import javax.swing.*;
import java.awt.*;

public class ex2 extends JFrame{
    public ex2(){
        setTitle("Login");
        setSize(400,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout()); /* Setando estilo base pro panel ficar centralizado */

        /* Criando componentes */
        /* INICIALIZANDO JPANEL COM GRID LAYOUT - Ele que vai ter esse estilo*/
        JPanel painelFormulario = new JPanel(new GridLayout(2,2));


        JLabel lbUtilizador = new JLabel("Utilizador: ");
        JTextField txtUtilizador = new JTextField();

        JLabel lblSenha = new JLabel("Senha");
        JTextField txtSenha = new JPasswordField();

        /* Adicionando os elementos ao painel */
        painelFormulario.add(lbUtilizador);
        painelFormulario.add(txtUtilizador);
        painelFormulario.add(lblSenha);
        painelFormulario.add(txtSenha);

        JPanel painelBotao = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton botao = new JButton("Entrar");
        painelBotao.add(botao);

        /* Adicionando fora do JPanel que tem o estilo Border */
        add(painelFormulario, BorderLayout.CENTER);
        add(painelFormulario, BorderLayout.SOUTH);

    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(() -> {
            new ex2().setVisible(true);
        });
    }
}
