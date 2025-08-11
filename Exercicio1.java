import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;

public class Exercicio1 {
    public static void main(String[] args) {

        // Criação do frame
        JFrame frame = new JFrame("Painel de Controle");

        // Ajuste do tamanho do frame
        frame.setSize(400, 300); 

        // Definindo função padrão de fechar o frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Centraliza o painel
        frame.setLocationRelativeTo(null);

        // Painel principal
        JPanel panel = new JPanel();

        // Definindo a cor de fundo do painel
        panel.setBackground(Color.GREEN);

        // Criação da borda
        Border border = BorderFactory.createTitledBorder("Painel de Controle");

        // Atribuição da borda ao painel
        panel.setBorder(border);

        // Criação do botão
        Button button = new Button("Clique Aqui ");

        // Definindo a cor de fundo do botão
        button.setBackground(Color.YELLOW);

        // Atribuição do botão ao painel
        panel.add(button);

        // Atribuição do painel ao frame
        frame.add(panel);

        // Tornando o frame visível
        frame.setVisible(true);
    }
}


