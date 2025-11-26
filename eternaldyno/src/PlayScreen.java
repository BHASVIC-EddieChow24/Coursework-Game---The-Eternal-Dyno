import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayScreen extends JPanel implements Runnable{

//creating the variables for this class
    private JPanel panel1;
    Keyhandler keyhandler = new Keyhandler();
    Player player = new Player (this, keyhandler);
    Thread gameThread;

//setting the rules for this class
    public PlayScreen() {
        this.setBackground(Color.BLACK);
        this.addKeyListener(keyhandler);
        this.setDoubleBuffered(true);
        this.setFocusable(true);
    }

//open function, turns the window into the playscreen from main menu
    public static void open(JFrame window){
        PlayScreen playScreen = new PlayScreen();
        window.setContentPane(playScreen);
        window.revalidate();
        window.repaint();
        playScreen.requestFocusInWindow();
        playScreen.startGameThread();
    }

//starts the game thread
    public void startGameThread(){
        gameThread = new Thread(this);
        gameThread.start();
    }

    //runs the thread, updating and repainting
    @Override
    public void run(){
        //setting the refresh rate to 30Hz, interval is 1/30 of a second
        int frametime = 1000/30;

        while(gameThread != null){
            long time1 = System.currentTimeMillis();
            update();
            repaint();
            long time2 = System.currentTimeMillis();
            long timetaken = time2 - time1;
            long sleeptime = frametime - timetaken;

            if( sleeptime < 0){
                sleeptime = 0;
            }

            try {
                Thread.sleep(sleeptime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //what changes every cycle of the thread
    public void update(){
        player.update();
    }

    //what is being outputted to the screen every cycle of the thread
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        player.paint(g2d);
        g2d.dispose();

    }
}
