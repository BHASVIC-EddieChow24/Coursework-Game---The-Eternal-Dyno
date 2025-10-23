import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Leaderboard extends JPanel {

    public Leaderboard() {
        this.setLayout(null);
    }

    public static void open(JFrame window){
        Leaderboard leaderboard = new Leaderboard();
        window.setContentPane(leaderboard);
        window.revalidate();
        window.repaint();
    }

}
