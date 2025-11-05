import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayScreen extends JPanel implements Runnable{

    private JPanel panel1;
    int  playerX = 400;
    int  playerY = 500;
    int playerSpeed = 10;
    Keyhandler keyhandler = new Keyhandler();
    Thread gameThread;


    public PlayScreen() {
        this.setBackground(Color.BLACK);
        this.addKeyListener(keyhandler);
        this.setFocusable(true);
    }

    public static void open(JFrame window){
        PlayScreen playScreen = new PlayScreen();
        window.setContentPane(playScreen);
        window.revalidate();
        window.repaint();
        playScreen.startGameThread();
    }

    public void startGameThread(){
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run(){

        while(gameThread != null){

            System.out.println("running");

            update();
            repaint();

        }
    }

    public void update(){
        if(keyhandler.leftPressed){
            playerX -= playerSpeed;
        }
        if(keyhandler.rightPressed){
            playerX += playerSpeed;
        }
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(Color.WHITE);
        g2d.fillRect(playerX,playerY, 60, 60);
        g2d.dispose();

    }

}
