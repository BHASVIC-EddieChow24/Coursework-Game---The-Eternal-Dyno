import javax.swing.*;

public class MainMenu extends JFrame {
    private JPanel Background;
    private JButton startbutton;


    public MainMenu() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(Background);
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        JFrame frame = new MainMenu();
        frame.setVisible(true); //opens the window
    }
}
