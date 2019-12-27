import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Janela extends JFrame {

    private JTextField entrada1;
    private JTextField entrada2;
    private JButton soma;
    private JButton vezes;
    private JButton menos;
    private JButton divisao;
    private JLabel saida;

    public Janela() {
        setLayout(new FlowLayout());
        entrada1 = new JTextField(4);
        entrada2 = new JTextField(4);
        saida = new JLabel("");
        soma = new JButton("+");
        vezes = new JButton("*");
        menos = new JButton("-");
        divisao = new JButton("/");
        add(entrada1);
        add(entrada2);
        add(soma);
        add(vezes);
        add(menos);
        add(divisao);
        add(saida);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(350, 80);
        this.setTitle("Calculadora Binaria GUI");
        soma.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                saida.setText("=" + Operation(0));
            }
        });
        vezes.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                saida.setText("=" + Operation(1));
            }
        });
        menos.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                saida.setText("=" + Operation(2));
            }
        });
        divisao.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                saida.setText("=" + Operation(3));
            }
        });

    }

    private double Operation(int teste) {
        double num1, num2, res = 0;
        num1 = Double.parseDouble(entrada1.getText());
        num2 = Double.parseDouble(entrada2.getText());
        if (teste == 0)
            res = num1 + num2;
        if (teste == 1)
            res = num1 * num2;
        if (teste == 2)
            res = num1 - num2;
        if (teste == 3) {
            if (num2 == 0) {
                JOptionPane.showMessageDialog(this, "Valor invalido para o campo 2.", // mensagem
                        "Erro 404", // titulo da janela
                        JOptionPane.ERROR_MESSAGE);
            } else {
                res = num1 / num2;
            }
        }
        return res;
    }
}
