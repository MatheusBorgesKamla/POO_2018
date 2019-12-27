import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Janela extends JFrame {

    private JPanel painel, painel1, painel2;

    private JTextField massa = new JTextField(9);
    private JTextField alt = new JTextField(9);

    private JButton calc = new JButton("Calcular");
    private JButton limp = new JButton("Limpar");

    private JLabel text1 = new JLabel("Massa(Kg):");
    private JLabel text2 = new JLabel("Altura(m):  ");

    private JLabel result1 = new JLabel();
    private JLabel result2 = new JLabel();

    public Janela() {
        super("Calculando o IMC");
        Painel();
        setSize(250, 300);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        add(painel);
        calc.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                result1.setText("=" + Operacao());
                result2.setText(Estado(Operacao()));
            }
        });

        limp.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                result1.setText("");
                result2.setText("");
            }
        });
    }

    private void Painel() {

        painel1 = new JPanel();
        painel1.add(text1);
        painel1.add(massa);
        painel1.add(text2);
        painel1.add(alt);
        painel1.add(calc);
        painel1.add(limp);
        painel1.add(result1);

        painel2 = new JPanel();
        painel2.add(result2);

        painel = new JPanel();
        painel.add(painel1);
        painel.add(painel2);

        painel1.setBorder(BorderFactory.createTitledBorder("IMC"));
        painel1.setPreferredSize(new Dimension(210, 150));

        painel2.setBorder(BorderFactory.createTitledBorder("Resultado"));
        painel2.setPreferredSize(new Dimension(210, 100));

    }

    private double Operacao() {
        double m, a, res;
        m = Double.parseDouble(massa.getText());
        a = Double.parseDouble(alt.getText());
        if (a == 0) {
            res = 0;
            JOptionPane.showMessageDialog(this, "Valor invalido para altura.", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            res = m / (a * a);
        }

        return res;
    }

    public String Estado(double parametro) {
        String resultado = null;

        if (parametro < 18.5)
            resultado = "Baixo peso";
        else if (parametro >= 18.5 && parametro < 24.9)
            resultado = "Normal";
        else if (parametro >= 25.0 && parametro <= 29.9)
            resultado = "Pre-obeso";
        else if (parametro >= 30.0 && parametro <= 34.9)
            resultado = "Obesidade classe I (leve)";
        else if (parametro >= 35.0 && parametro < 39.9)
            resultado = "Obesidade classe II (moderada)";
        else
            resultado = "Obesidade classe III (grave,morbida)";

        // Retorna a variável resultado no modo String
        return resultado;

    }

}