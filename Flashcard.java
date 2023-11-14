import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Flashcard extends JPanel {
    private JPanel panel1;
    private JTextField textField1;
public Flashcard() {


    this.panel1.setPreferredSize(new Dimension(220, 40));
    this.panel1.setBackground(Color.BLACK);

    // creating button on external JPanel
    JButton button = new JButton("Button (+JPanel) from external class");

    // adding button to the black JPanel
    this.panel1.add(button);

    // adding blackJPanel
    add(this.panel1);


}
}

