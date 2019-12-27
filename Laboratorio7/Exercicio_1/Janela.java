import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Janela extends JFrame {

    private JTextField entrada1;
    private JTextField entrada2;
    private JButton botao;
    private JLabel saida;

    public Janela() {
        setLayout(new FlowLayout());
        entrada1 = new JTextField(4);
        entrada2 = new JTextField(4);
        saida = new JLabel("");
        botao = new JButton("+");
        add(entrada1);
        add(entrada2);
        add(botao);
        add(saida);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(300, 80);
        this.setTitle("Calculadora Binaria GUI");
        // Evento a = new Evento(entrada1, entrada2, saida);
        botao.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                double num1, num2;
                num1 = Double.parseDouble(entrada1.getText());
                num2 = Double.parseDouble(entrada2.getText());
                double res = num1 + num2;
                saida.setText("=" + res);
            }
        });

    }
}
