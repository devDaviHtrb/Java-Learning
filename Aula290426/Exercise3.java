
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import java.awt.*;

public class Exercise3 extends JFrame{
    public Exercise3(){
        setTitle(("Tela de Login"));
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        JPanel painelForm = new JPanel(new GridLayout(2,2));
        JLabel lbUtilizador = new JLabel("Utilizador");
        JTextField txtUtilizador = new JTextField();

        JLabel lbPass = new JLabel("Password");
        JPasswordField txtPass = new JPasswordField();

        painelForm.add(lbUtilizador);
        painelForm.add(txtUtilizador);
        painelForm.add(lbPass);
        painelForm.add(txtPass);

        JPanel painelButton = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton button = new JButton("Entrar");

        button.addActionListener((e)->{
            login(txtUtilizador, txtPass);
        });
        painelButton.add(button);

        add(painelButton, BorderLayout.SOUTH);
        add(painelForm, BorderLayout.CENTER);
    }

    public void login(JTextField loginField, JPasswordField passField){
        String login = loginField.getText();
        String pass = new String(passField.getPassword());
        String message = "";

        if(login.equals("admin")&&pass.equals("1234")){
            message = "Login efetuado com sucesso";
        }else{
            message = "credenciais incorretas";
            loginField.setText("");
            passField.setText("");
        }
        
        JOptionPane.showMessageDialog(null, message);
    }
        public static void main(String [] args){
        SwingUtilities.invokeLater(()->{
            Exercise3 janela = new Exercise3();
            janela.setVisible(true);
        });
    }
    
}