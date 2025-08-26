import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.text.ParseException;

public class Exercicio4 {
    public static void main(String[] args) {
        // Criação do frame
        JFrame frame = new JFrame("Campo de Data");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new FlowLayout());

        // Criação do JLabel com o texto "Data de Nascimento:"
        JLabel label = new JLabel("Data de Nascimento:");

        // Criação do JFormattedTextField
        JFormattedTextField formattedTextField = null;

        try {
            // Criação do MaskFormatter com a máscara para data "dd/mm/aaaa"
            MaskFormatter dateMask = new MaskFormatter("##/##/####");
            // Define o caractere de placeholder para os dígitos não preenchidos
            dateMask.setPlaceholderCharacter('_');
            // Cria o JFormattedTextField usando o MaskFormatter
            formattedTextField = new JFormattedTextField(dateMask);
            formattedTextField.setPreferredSize(new Dimension(100, 25));

        } catch (ParseException e) {
            // Tratamento de erro caso a máscara seja inválida
            e.printStackTrace();
        }

        // Adiciona os componentes ao frame
        frame.add(label);
        frame.add(formattedTextField);

        // Torna o frame visível
        frame.setVisible(true);
    
    // A classe MaskFormatter aplica regras de formatação a um JFormattedTextField.
    // A máscara, como "##/##/####", usa caracteres especiais como o # para indicar
    // que um dígito numérico é esperado. O método setPlaceholderCharacter('_')
    // define um caractere de placeholder (_) para preencher os espaços ainda não
    // digitados pelo usuário.
    }
}