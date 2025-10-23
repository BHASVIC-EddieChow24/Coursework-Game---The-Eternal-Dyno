import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UsernameInput extends JPanel {

    public UsernameInput() {
        this.setLayout(null);
    }

    public static void open(JFrame window){
        UsernameInput usernameInput = new UsernameInput();
        window.setContentPane(usernameInput);
        window.revalidate();
        window.repaint();
    }

}
