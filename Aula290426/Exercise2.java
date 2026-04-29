import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import java.awt.*;

public class Exercise2 extends JFrame{
    public Exercise2(){
        setTitle(("Tela de Login"));
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        JPanel painelForm = new JPanel(new GridLayout(2,2));
        JLabel lbUtilizador = new JLabel("Utilizador");
        JTextField txtUtilizador = new JTextField();

        JLabel lbPass = new JLabel("Password");
        JTextField txtPass = new JTextField();

        painelForm.add(lbUtilizador);
        painelForm.add(txtUtilizador);
        painelForm.add(lbPass);
        painelForm.add(txtPass);

        JPanel painelButton = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton button = new JButton("Entrar");

        painelButton.add(button);

        add(painelButton, BorderLayout.SOUTH);
        add(painelForm, BorderLayout.CENTER);


    }
        public static void main(String [] args){
        SwingUtilities.invokeLater(()->{
            Exercise2 janela = new Exercise2();
            janela.setVisible(true);
        });
    }
    
}
