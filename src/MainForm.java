import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm {


    private JTextField lblnome;
    private JTextField txtnome;
    private JButton bntValidar;
    private JLabel txtResultado;
    private JPanel mainPanel;

    public static void main(String[] args) {
        //CRIA A MINHA TELA (TV)
        JFrame frame = new JFrame("Minha primeira tela");
        //MOSTRA QUAL PAINEL VAI SER ASSISTIDO
        frame.setContentPane(new MainForm().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Ajusta a minha TV no tamanho do meu painel
        frame.pack();
        //frame.setSize(500, 500);
        //Ligar a TV
        frame.setVisible(true);

    }

    public MainForm() {
        new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nomeDigitado = txtnome.getText();

                txtResultado.setText(nomeDigitado);
            }
        };
    }

}

