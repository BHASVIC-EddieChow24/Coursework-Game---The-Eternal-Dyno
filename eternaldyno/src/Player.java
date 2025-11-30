import javax.swing.*;
import java.awt.*;

public class Player {
    public int x = 600,y = 600;
    public int horizontalspeed = 15, vertspeed = 15;
    public boolean jumping = false;

    PlayScreen playscreen;
    Keyhandler keyhandler;
    Image climberHang, climberJump;

    public Player(PlayScreen playscreen, Keyhandler keyhandler) {
        this.playscreen = playscreen;
        this.keyhandler = keyhandler;
        climberHang = new ImageIcon(getClass().getResource("/Climber hang.png")).getImage();
        climberJump = new ImageIcon(getClass().getResource("/Climber jump.png")).getImage();
    }

    public void update(){
        if(keyhandler.spacePressed && !jumping){
            jumping = true;
        }
        if(jumping){
            y -= vertspeed;
        }
            if (keyhandler.leftPressed) {
                x -= horizontalspeed;
            } else if (keyhandler.rightPressed) {
                x += horizontalspeed;
            }
    }

    public void onPlatform(int platformY){
        y = platformY;
        jumping = false;
    }

    public boolean gameover(){
        return( y < 0 || y > 1050);
    }

    //what is being outputted to the screen every cycle of the thread
    public void paint(Graphics g2d){
        if(keyhandler.spacePressed || jumping){
            g2d.drawImage(climberJump, x, y, 256, 384, null);
        }
        else{
            g2d.drawImage(climberHang, x, y, 256, 384, null);
        }

    }
}
