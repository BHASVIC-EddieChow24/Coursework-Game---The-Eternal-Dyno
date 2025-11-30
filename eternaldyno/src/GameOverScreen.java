import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameOverScreen extends JPanel {
    int finalscore;
    private JButton playbutton;
    private JButton menubutton;

    public GameOverScreen(int score) {
        this.setLayout(null);
        this.finalscore = score;

        setLayout(null);
        setBackground(Color.black);

        JLabel title = new JLabel("Game Over");
        title.setFont(new Font("ALGERIAN", Font.BOLD, 40));
        title.setForeground(Color.white);
        title.setHorizontalAlignment(JLabel.CENTER);
        add(title);

        JLabel scorelabel = new JLabel("YOU SCORED", + finalscore);
        title.setFont(new Font("ALGERIAN", Font.BOLD, 40));
        title.setForeground(Color.white);
        title.setHorizontalAlignment(JLabel.CENTER);
        add(title);


    }
    public static void open(JFrame window, int score){
        GameOverScreen gos = new GameOverScreen(score);
        window.setContentPane(gos);
        window.revalidate();
        window.repaint();
        gos.requestFocusInWindow();
    }



}
