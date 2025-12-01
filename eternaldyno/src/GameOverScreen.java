import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameOverScreen extends JFrame {
    int finalscore;
    private JButton playbutton;
    private JButton menubutton;
    public JLabel background;

    //setting the rules for this class
    public GameOverScreen(int score) {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(1550, 1050);
        this.setLocationRelativeTo(null);
        this.setFocusable(true);
        this.finalscore = score;

        //sets layout to null, then background to black
        setLayout(null);
        setBackground(Color.black);

        //generates the title, sets its rules and then adds it
        JLabel title = new JLabel("Game Over");
        title.setFont(new Font("ALGERIAN", Font.BOLD, 40));
        title.setForeground(Color.white);
        title.setHorizontalAlignment(JLabel.CENTER);
        add(title);

        //generates a label for the final score, sets its rules and then adds it
        JLabel scorelabel = new JLabel("YOU SCORED", + finalscore);
        title.setFont(new Font("ALGERIAN", Font.BOLD, 40));
        title.setForeground(Color.white);
        title.setHorizontalAlignment(JLabel.CENTER);
        add(scorelabel);


    }


}
