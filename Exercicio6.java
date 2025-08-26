import javax.swing.*;
import java.awt.*;

public class Exercicio6 {
    public static void main(String[] args) {
        // Criação do frame
        JFrame frame = new JFrame("JSplitPane Exemplo");
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        // Criação dos JPanels para os lados esquerdo e direito
        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(Color.RED);
        leftPanel.add(new JLabel("Esquerda"));

        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(Color.BLUE);
        rightPanel.add(new JLabel("Direita"));

        // Criação do JSplitPane com orientação vertical
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftPanel, rightPanel);

        // Configura a divisória a 40% da largura do JSplitPane
        splitPane.setDividerLocation(0.4);

        // Adiciona o JSplitPane ao frame
        frame.add(splitPane);

        // Torna o frame visível
        frame.setVisible(true);

        // O método setDividerLocation do JSplitPane controla a posição da divisória. Se
        // o valor for um número decimal entre 0.0 e 1.0, a posição é definida como uma
        // porcentagem do tamanho total. Por exemplo, 0.4 move a divisória para 40% da
        // largura. Se o valor for um número inteiro, a posição é definida em pixels.
    }
}