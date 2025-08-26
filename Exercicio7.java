import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Exercicio7 {
    public static void main(String[] args) {
        // Criação do frame
        JFrame frame = new JFrame("JComboBox Exemplo");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        // Criação dos itens para o JComboBox
        String[] paises = {"Brasil", "Argentina", "Chile"};

        // Criação do JComboBox com os itens
        JComboBox<String> paisesComboBox = new JComboBox<>(paises);

        // Define "Argentina" como o item selecionado por padrão
        paisesComboBox.setSelectedItem("Argentina");

        // Criação do JLabel para exibir o item selecionado
        JLabel resultadoLabel = new JLabel("País selecionado: Argentina");

        // Adiciona um ItemListener ao JComboBox
        paisesComboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                // Verifica se o evento foi de seleção de um item
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    // Atualiza o texto do JLabel com o item selecionado
                    String selectedCountry = (String) e.getItem();
                    resultadoLabel.setText("País selecionado: " + selectedCountry);
                }
            }
        });

        // Adiciona os componentes ao frame
        frame.add(paisesComboBox);
        frame.add(resultadoLabel);

        // Torna o frame visível
        frame.setVisible(true);
    }
}