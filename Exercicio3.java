import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Exercicio3 {
    public static void main(String[] args) {

        // Criação do frame
        JFrame frame = new JFrame("Painel de Controle");

        // Ajuste do tamanho do frame
        frame.setSize(400, 300);

        // Definindo função padrão de fechar o frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Centraliza o frame
        frame.setLocationRelativeTo(null);

        // Criação do scrollPane
        JScrollPane scrollPane = new JScrollPane();

        // Criação do textArea
        JTextArea textArea = new JTextArea(10,30);

        // Adição do texto pré-definido
        textArea.setText("Java Swing é uma biblioteca poderosa e amplamente utilizada para a criação de interfaces gráficas de usuário (GUIs) em aplicações Java. Introduzida como parte do Java Foundation Classes (JFC), Swing oferece uma ampla gama de componentes gráficos, como botões, caixas de texto, tabelas, menus e muito mais, permitindo que os desenvolvedores criem interfaces ricas e interativas.\r\n" + //
                        "\r\n" + //
                        "Uma das principais vantagens do Swing é sua independência de plataforma. Como é baseado em Java, as aplicações desenvolvidas com Swing podem ser executadas em qualquer sistema operacional que suporte a Java Virtual Machine (JVM). Isso torna Swing uma escolha popular para projetos que exigem portabilidade e consistência visual em diferentes ambientes.\r\n" + //
                        "\r\n" + //
                        "Além disso, Swing é altamente personalizável. Os desenvolvedores podem modificar a aparência e o comportamento dos componentes utilizando o modelo de renderização e o sistema de \"Look and Feel\". Isso significa que é possível criar interfaces que se alinhem à identidade visual de uma marca ou que ofereçam uma experiência de usuário única.\r\n" + //
                        "\r\n" + //
                        "Outro ponto forte do Swing é sua arquitetura orientada a eventos. Isso permite que os desenvolvedores lidem com interações do usuário de forma eficiente, utilizando ouvintes de eventos para capturar ações como cliques de botão, movimentação do mouse ou entrada de texto. Essa abordagem facilita a criação de aplicações responsivas e dinâmicas.\r\n" + //
                        "\r\n" + //
                        "Embora Swing seja uma tecnologia madura e confiável, é importante notar que, nos últimos anos, outras bibliotecas e frameworks, como JavaFX, têm ganhado popularidade devido a seus recursos mais modernos e suporte aprimorado para multimídia e animações. No entanto, Swing continua sendo uma escolha sólida para muitos projetos, especialmente aqueles que já possuem uma base de código estabelecida ou que não requerem funcionalidades avançadas.\r\n" + //
                        "\r\n" + //
                        "Em resumo, Java Swing é uma ferramenta versátil e robusta para o desenvolvimento de GUIs em Java. Sua independência de plataforma, personalização e arquitetura orientada a eventos fazem dele uma opção valiosa para desenvolvedores que buscam criar interfaces gráficas eficientes e atraentes.");
        
        // Modifica a cor do fundo
        textArea.setBackground(Color.LIGHT_GRAY);

        // Modifica a fonte do textArea
        textArea.setFont(new Font("Arial", 0, 12));

        // Adiciona o textArea ao frame
        scrollPane.setViewportView(textArea);

        // Adiciona o scrollPane ao frame
        frame.add(scrollPane);

        // Deixa o frame visível
        frame.setVisible(true);

        // O JScrollPane é necessário para conseguir ler todo o texto, independente do tamanho
    }
}