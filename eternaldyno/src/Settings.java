import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Settings extends JPanel {

    public Settings() {
        this.setLayout(null);
    }

    public static void open(JFrame window){
        Settings settings = new Settings();
        window.setContentPane(settings);
        window.revalidate();
        window.repaint();
    }

}
