import javax.swing.*;

public class Main extends JFrame {
    private JPanel MainPanel;
    private JTextArea textArea1;

    public Main(){

        setContentPane(MainPanel);
        setTitle("Swag");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {

        JFrame content = new Main();
        Flashcard flash = new Flashcard();



    }
}