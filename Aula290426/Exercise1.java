import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Exercise1 extends JFrame {
    public Exercise1(){
        setTitle(("Primeira janela em java"));
        setSize(800, 600);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String [] args){
        SwingUtilities.invokeLater(()->{
            Exercise1 janela = new Exercise1();
            janela.setVisible(true);
        });
    }
    
}
