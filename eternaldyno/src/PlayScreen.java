import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;

public class PlayScreen extends JPanel implements Runnable{

//creating the variables for this class
    private JPanel panel1;
    Keyhandler keyhandler = new Keyhandler();
    Player player = new Player (this, keyhandler);
    Thread gameThread;

    int back1y = 0, back2y = 0, scrollspeed = 4, score = 0;
    BufferedImage background;

    Platform[] platforms =  new Platform[5];
    int platformCount = 0;
    Image platformImage;
    Random rand = new Random();


//setting the rules for this class
    public PlayScreen() {
        this.addKeyListener(keyhandler);
        this.setFocusable(true);

        try (InputStream instream = getClass().getResourceAsStream("/Main background.png")) {
            background = ImageIO.read(instream);
            back1y = 0;
            back2y = -background.getHeight();
        }catch (IOException e){
            e.printStackTrace();
            background = null;
        }

        platformImage = new ImageIcon(getClass().getResource("/Platform.png")).getImage();
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

        score += 4;

        if(background != null){
            back1y += scrollspeed;
            back2y += scrollspeed;

            int height = background.getHeight();

            if(back1y > height){
                back1y = back2y - height;
            }
            if(back2y > height){
                back2y = back1y - height;
            }
        }

        player.update();
    }

    //what is being outputted to the screen every cycle of the thread
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        if(background != null){
            g2d.drawImage(background, 0, back1y, background.getWidth(), background.getHeight(), null);
            g2d.drawImage(background, 0, back2y, background.getWidth(), background.getHeight(), null);
        }

        g2d.setFont(new Font("ALGERIAN", Font.PLAIN, 30));
        g2d.drawString("Score: "+score, 50, 75);

        player.paint(g2d);
        g2d.dispose();

    }
}
