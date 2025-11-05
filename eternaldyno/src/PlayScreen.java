import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayScreen extends JPanel implements Runnable{

    private JPanel panel1;
    private Thread gameThread;

    public PlayScreen() {
    }

    public static void open(JFrame window){
        PlayScreen playScreen = new PlayScreen();
        window.setContentPane(playScreen);
        window.revalidate();
        window.repaint();


    }

    public void startGameThread(){
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run(){

        while(gameThread != null){
            update();
            repaint();

        }
    }

    public void update(){
        
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }

}
