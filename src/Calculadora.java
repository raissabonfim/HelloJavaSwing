import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    private JTextField txtPrimeiroValor;
    private JTextField txtSegundoValor;
    private JButton btnsomar;
    private JTextField txtResultado;
    private JButton btnlimpar;
    private JPanel panelMain;


    public  Calculadora(){

        btnsomar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Peguei informação da tela

                Integer primeiro = Integer.valueOf(txtPrimeiroValor.getText());
                Integer segundo = Integer.valueOf(txtSegundoValor.getText());

                //Processei
                Integer soma = primeiro + segundo;

                //Mandei pra tela o resultado
                txtResultado.setText(soma.toString());



            }
        });

    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Minha calculadora");
        frame.setContentPane(new Calculadora().panelMain);
        frame.setSize(400, 400);
        frame.setVisible(true);


    }
}
