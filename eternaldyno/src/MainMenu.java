import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JFrame {
    private JLabel Background;
    private JPanel background;
    private JButton lbbutton;
    private JButton settingsbutton;
    private JButton customisebutton;
    private JButton usernamebutton;

    public MainMenu() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1200, 800);
        this.setLocationRelativeTo(null);

        ImageIcon backgroundIcon = new ImageIcon(getClass().getResource("/background img.png"));
        Background = new JLabel(backgroundIcon);
        Background.setBounds(0, 0, 1200, 800);

        add(Background);
    }

    public static void main(String[] args) {
        JFrame frame = new MainMenu();
        frame.setVisible(true); //opens the window
    }
}