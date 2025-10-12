import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JFrame {
    private JLabel Background;
    private JButton playbutton;
    private JButton lbbutton;
    private JButton settingsbutton;
    private JButton customisebutton;
    private JButton usernamebutton;

    public MainMenu() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1200, 800);
        this.setLocationRelativeTo(null);

        ImageIcon backgroundIcon = new ImageIcon(getClass().getResource("/background img school.jpg"));
        Background = new JLabel(backgroundIcon);
        Background.setBounds(0, 0, 1200, 800);

        ImageIcon playbuttonicon = new ImageIcon(getClass().getResource("/PlayButton.png"));
        Image resizebuttonicon = playbuttonicon.getImage().getScaledInstance(200,150, Image.SCALE_SMOOTH);
        ImageIcon playbuttonicon1 = new ImageIcon(resizebuttonicon);
        playbutton = new JButton(playbuttonicon1);
        playbutton.setBounds(500,500,200,150);

        playbutton.setContentAreaFilled(false);
        playbutton.setBorderPainted(false);
        add(playbutton);
        add(Background);
    }

    public static void main(String[] args) {
        JFrame frame = new MainMenu();
        frame.setVisible(true); //opens the window
    }

}