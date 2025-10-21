import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayScreen extends JPanel {
    private JPanel back;

    public PlayScreen() {
        this.setLayout(null);
    }

    public static void open(JFrame window){
        PlayScreen playScreen = new PlayScreen();
        window.setContentPane(playScreen);
        window.revalidate();
        window.repaint();
    }

}
