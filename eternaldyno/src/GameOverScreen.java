import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameOverScreen extends JFrame {
    int finalscore;
    private JButton playbutton;
    private JButton menubutton;
    public JLabel background;

    public GameOverScreen(int score) {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(1550, 1050);
        this.setLocationRelativeTo(null);
        this.setFocusable(true);

        this.finalscore = score;

        setLayout(null);
        setBackground(Color.black);

        ImageIcon backgroundIcon = new ImageIcon(getClass().getResource("/background img.png"));
        background = new JLabel(backgroundIcon);
        background.setBounds(0, 0, 1600, 1200);

        JLabel title = new JLabel("Game Over");
        title.setFont(new Font("ALGERIAN", Font.BOLD, 40));
        title.setForeground(Color.white);
        title.setHorizontalAlignment(JLabel.CENTER);
        add(title);

        JLabel scorelabel = new JLabel("YOU SCORED", + finalscore);
        title.setFont(new Font("ALGERIAN", Font.BOLD, 40));
        title.setForeground(Color.white);
        title.setHorizontalAlignment(JLabel.CENTER);
        add(scorelabel);

        add(menubutton = new JButton("Play Again"));

        add(background);


    }


}
