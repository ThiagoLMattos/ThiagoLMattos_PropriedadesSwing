import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercicio5 {
    public static void main(String[] args) {
        // Criação do frame
        JFrame frame = new JFrame("Seleção de Gênero");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        // Criação do JPanel para agrupar os JRadioButtons
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));

        // Criação dos JRadioButtons
        JRadioButton masculinoRadio = new JRadioButton("Masculino");
        JRadioButton femininoRadio = new JRadioButton("Feminino");
        JRadioButton outroRadio = new JRadioButton("Outro");

        // Criação do ButtonGroup para garantir que apenas um JRadioButton seja selecionado
        ButtonGroup generoGroup = new ButtonGroup();
        generoGroup.add(masculinoRadio);
        generoGroup.add(femininoRadio);
        generoGroup.add(outroRadio);

        // Adiciona os JRadioButtons ao painel
        panel.add(masculinoRadio);
        panel.add(femininoRadio);
        panel.add(outroRadio);

        // Criação do JButton
        JButton selecionarButton = new JButton("Selecionar");

        // Criação do JLabel para exibir o resultado
        JLabel resultadoLabel = new JLabel("Nenhuma opção selecionada.");

        // Adiciona um ActionListener ao botão
        selecionarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Verifica qual JRadioButton está selecionado
                if (masculinoRadio.isSelected()) {
                    resultadoLabel.setText("Gênero selecionado: Masculino");
                } else if (femininoRadio.isSelected()) {
                    resultadoLabel.setText("Gênero selecionado: Feminino");
                } else if (outroRadio.isSelected()) {
                    resultadoLabel.setText("Gênero selecionado: Outro");
                } else {
                    resultadoLabel.setText("Por favor, selecione uma opção.");
                }
            }
        });

        // Adiciona os componentes ao frame
        frame.add(panel);
        frame.add(selecionarButton);
        frame.add(resultadoLabel);

        // Torna o frame visível
        frame.setVisible(true);
    }
}