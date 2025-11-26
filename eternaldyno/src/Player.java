import java.awt.*;

public class Player {
    public int x = 500,y = 500;
    public int speed = 15;

    PlayScreen playscreen;
    Keyhandler keyhandler;

    public Player(PlayScreen playscreen, Keyhandler keyhandler) {
        this.playscreen = playscreen;
        this.keyhandler = keyhandler;
    }

    public void update(){
        if(keyhandler.leftPressed){
            x -= speed;
        }
        else if(keyhandler.rightPressed){
            x += speed;
        }
    }

    //what is being outputted to the screen every cycle of the thread
    public void paint(Graphics g2d){
        g2d.setColor(Color.WHITE);
        g2d.fillRect(x,y, 60, 60);

    }
}
