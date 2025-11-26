//Importing needed libraries
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Defining the variables for the class
public class MainMenu extends JFrame {
    public JLabel Background;
    private JButton playbutton;
    private JButton lbbutton;
    private JButton settingsbutton;
    private JButton customisebutton;
    private JButton usernamebutton;
    private JLabel Title;

    //Setting the rules for the class
    public MainMenu() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(1550, 1175);
        this.setLocationRelativeTo(null);
        this.setFocusable(true);

//Creating the background
        ImageIcon backgroundIcon = new ImageIcon(getClass().getResource("/background img.png"));
        Background = new JLabel(backgroundIcon);
        Background.setBounds(0, 0, 1600, 1200);

//Creating the playbutton and setting its location
        ImageIcon playicon = new ImageIcon(getClass().getResource("/Playbutton1.png"));
        Image resizedplayicon = playicon.getImage().getScaledInstance(200, 150, Image.SCALE_SMOOTH);
        ImageIcon finalplayicon = new ImageIcon(resizedplayicon);
        playbutton = new JButton(finalplayicon);

        playbutton.setBounds(880, 700, 200, 150);
        playbutton.setContentAreaFilled(false);
        playbutton.setBorderPainted(false);

        //checks to see if its being pressed
        playbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PlayScreen.open(MainMenu.this);
            }
        });

//Creating the settings button and setting its location
        ImageIcon settingsicon = new ImageIcon(getClass().getResource("/settingsbutton.jpg"));
        Image resizedsettingsicon = settingsicon.getImage().getScaledInstance(175, 150, Image.SCALE_SMOOTH);
        ImageIcon finalsettingsicon = new ImageIcon(resizedsettingsicon);
        settingsbutton = new JButton(finalsettingsicon);

        settingsbutton.setBounds(1300, 75, 150, 150);
        settingsbutton.setContentAreaFilled(false);
        settingsbutton.setBorderPainted(false);

        //checking to see if its being pressed
        settingsbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PlayScreen.open(MainMenu.this);
            }
        });

//creating the leaderboard button and setting its location
        ImageIcon lbicon = new ImageIcon(getClass().getResource("/leaderboardbutton.png"));
        Image resizedlbicon = lbicon.getImage().getScaledInstance(150, 120, Image.SCALE_SMOOTH);
        ImageIcon finallbicon = new ImageIcon(resizedlbicon);
        lbbutton = new JButton(finallbicon);

        lbbutton.setBounds(1200, 700, 200, 150);
        lbbutton.setContentAreaFilled(false);
        lbbutton.setBorderPainted(false);

        //checks to see if its being pressed
        lbbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PlayScreen.open(MainMenu.this);
            }
        });

//creating the customise button and setting its location
        ImageIcon customiseicon = new ImageIcon(getClass().getResource("/customisebutton.png"));
        Image resizedcustomiseicon = customiseicon.getImage().getScaledInstance(150, 120, Image.SCALE_SMOOTH);
        ImageIcon finalcustomiseicon = new ImageIcon(resizedcustomiseicon);
        customisebutton = new JButton(finalcustomiseicon);

        customisebutton.setBounds(550, 700, 200, 150);
        customisebutton.setContentAreaFilled(false);
        customisebutton.setBorderPainted(false);

        //checks to see if it is being pressed
        customisebutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PlayScreen.open(MainMenu.this);
            }
        });

//creating the username button and setting its location
        ImageIcon usernameicon = new ImageIcon(getClass().getResource("/usernamebutton.png"));
        Image resizedusernameicon = usernameicon.getImage().getScaledInstance(150, 120, Image.SCALE_SMOOTH);
        ImageIcon finalusernameicon = new ImageIcon(resizedusernameicon);
        usernamebutton = new JButton(finalusernameicon);

        usernamebutton.setBounds(1225, 400, 150, 120);
        usernamebutton.setContentAreaFilled(false);
        usernamebutton.setBorderPainted(false);

        //checks to see if its being pressed
        usernamebutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PlayScreen.open(MainMenu.this);
            }
        });

//Creating the title and its settings
        Title = new JLabel("THE ETERNAL DYNO");
        Title.setBounds(445, 70, 1000, 200);
        Title.setBackground(new Color(0, 0, 0, 0));
        Title.setForeground(Color.BLACK);
        Title.setBorder(null);

        Title.setFont(new Font("ALGERIAN", Font.BOLD, 80));

//adding everything to the window
        add(Title);
        add(lbbutton);
        add(settingsbutton);
        add(customisebutton);
        add(usernamebutton);
        add(playbutton);
        add(Background);
    }
}
