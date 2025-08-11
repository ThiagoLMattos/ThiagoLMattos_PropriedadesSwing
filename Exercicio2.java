import javax.swing.*;
import java.awt.*;

public class Exercicio2 {
    public static void main(String[] args) {

        // Criação do frame
        JFrame frame = new JFrame("Painel de Controle");

        // Ajuste do tamanho do frame
        frame.setSize(400, 300);

        // Definindo função padrão de fechar o frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Centraliza o painel
        frame.setLocationRelativeTo(null);

        // Criação do tabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Criação da aba 1
        // Criação do Label
        JLabel label = new JLabel("Bem-vindo às Configurações!");

        // Atribuição do Label à Aba 1 do tabbedPane
        tabbedPane.addTab("Configurações", label);

        // Criação da aba 2
        // Criação do Panel
        JPanel panel = new JPanel();

        // Definindo a cor de fundo do panel
        panel.setBackground(Color.BLUE);

        // Criação do textField
        JTextField textField = new JTextField();

        // Adicionando texto como Placeholder
        textField.setText("Digite seu nome");

        // Adicionando o textField ao painel
        panel.add(textField);

        // Atribuição do panel à Aba 2 do tabbedPane
        tabbedPane.addTab("Perfil", panel);

        // Criação da aba 3
        // Criação do textArea
        JTextArea textArea = new JTextArea();
        
        // Adicionando texto como placeHolder
        textArea.setText("Digite suas dúvidas aqui");

        // Atribuição do textArea à Aba 3 do tabbedPane
        tabbedPane.addTab("Ajuda", textArea);

        // Adiciona o tabbedPane ao frame
        frame.add(tabbedPane);

        // Deixa o frame vísivel
        frame.setVisible(true);

    }
}
