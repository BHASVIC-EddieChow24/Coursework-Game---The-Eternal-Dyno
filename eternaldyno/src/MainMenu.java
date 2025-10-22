import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JFrame {
    public JLabel Background;
    private JButton playbutton;
    private JButton lbbutton;
    private JButton settingsbutton;
    private JButton customisebutton;
    private JButton usernamebutton;
    private JTextField Title;

    public MainMenu() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1550, 1175);
        this.setLocationRelativeTo(null);

        ImageIcon backgroundIcon = new ImageIcon(getClass().getResource("/background img.png"));
        Background = new JLabel(backgroundIcon);
        Background.setBounds(0, 0, 1600, 1200);

        ImageIcon playicon = new ImageIcon(getClass().getResource("/Playbutton1.png"));
        Image resizedplayicon = playicon.getImage().getScaledInstance(200,150, Image.SCALE_SMOOTH);
        ImageIcon finalplayicon = new ImageIcon(resizedplayicon);
        playbutton = new JButton(finalplayicon);

        playbutton.setBounds(880,700,200,150);
        playbutton.setContentAreaFilled(false);
        playbutton.setBorderPainted(false);

        playbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PlayScreen.open(MainMenu.this);
            }
        });

        ImageIcon settingsicon = new ImageIcon(getClass().getResource("/settingsbutton.jpg"));
        Image resizedsettingsicon = settingsicon.getImage().getScaledInstance(175,150, Image.SCALE_SMOOTH);
        ImageIcon finalsettingsicon = new ImageIcon(resizedsettingsicon);
        settingsbutton = new JButton(finalsettingsicon);

        settingsbutton.setBounds(1220,75,150,150);
        settingsbutton.setContentAreaFilled(false);
        settingsbutton.setBorderPainted(false);

        ImageIcon lbicon = new ImageIcon(getClass().getResource("/leaderboardbutton.png"));
        Image resizedlbicon = lbicon.getImage().getScaledInstance(150,120, Image.SCALE_SMOOTH);
        ImageIcon finallbicon = new ImageIcon(resizedlbicon);
        lbbutton = new JButton(finallbicon);

        lbbutton.setBounds(1200,700,200,150);
        lbbutton.setContentAreaFilled(false);
        lbbutton.setBorderPainted(false);

        ImageIcon customiseicon = new ImageIcon(getClass().getResource("/customisebutton.png"));
        Image resizedcustomiseicon = customiseicon.getImage().getScaledInstance(150,120, Image.SCALE_SMOOTH);
        ImageIcon finalcustomiseicon = new ImageIcon(resizedcustomiseicon);
        customisebutton = new JButton(finalcustomiseicon);

        customisebutton.setBounds(550,700,200,150);
        customisebutton.setContentAreaFilled(false);
        customisebutton.setBorderPainted(false);

        ImageIcon usernameicon = new ImageIcon(getClass().getResource("/usernamebutton.png"));
        Image resizedusernameicon = usernameicon.getImage().getScaledInstance(150,120, Image.SCALE_SMOOTH);
        ImageIcon finalusernameicon = new ImageIcon(resizedusernameicon);
        usernamebutton = new JButton(finalusernameicon);

        usernamebutton.setBounds(1225,400,150,120);
        usernamebutton.setContentAreaFilled(false);
        usernamebutton.setBorderPainted(false);

        Title = new JTextField("THE ETERNAL DYNO");
        Font font = new Font("returns", Font.BOLD, 20);
        Title.setSize(200,300);
        Title.setFont(font);

        add(Title);
        add(lbbutton);
        add(settingsbutton);
        add(customisebutton);
        add(usernamebutton);
        add(playbutton);
        add(Background);
    }

    public static void main(String[] args) {
        JFrame frame = new MainMenu();
        frame.setVisible(true); //opens the window
    }

}