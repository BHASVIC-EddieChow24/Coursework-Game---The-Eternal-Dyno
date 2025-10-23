import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Customise extends JPanel {

    public Customise() {
        this.setLayout(null);
    }

    public static void open(JFrame window){
        Customise customise = new Customise();
        window.setContentPane(customise);
        window.revalidate();
        window.repaint();
    }

}
