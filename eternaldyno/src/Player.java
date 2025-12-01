import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

//setting the variables of the class
public class Player {
    public int x = 600,y = 600;
    public int horizontalspeed = 15, vertspeed = 15, timer = 0;
    public boolean jumping = false, latched = false;
    public int cooldown = 0;

    //adding the components
    PlayScreen playscreen;
    Keyhandler keyhandler;
    Image climberHang, climberJump;

    //setting the rules of the player class
    public Player(PlayScreen playscreen, Keyhandler keyhandler) {
        this.playscreen = playscreen;
        this.keyhandler = keyhandler;
        climberHang = new ImageIcon(getClass().getResource("/Climber hang.png")).getImage();
        climberJump = new ImageIcon(getClass().getResource("/Climber jump.png")).getImage();
    }

    //this is what happens 30 times per second
    public void update(){
        //checks if latched, and if so, moves the character down with the platform
        if(latched){
            y+=4;

            if(keyhandler.spacePressed){
                jumping = true;
                latched = false;
                cooldown = 5;
            }
            else{
                return;
            }
        }

        //takes one away from cooldown if it isn't yet 0
        if(cooldown >0){
            cooldown--;
        }

        //sets the variables for when you are jumping
        if(keyhandler.spacePressed){
            jumping = true;
            latched = false;
            cooldown = 5;
        }

        //makes player rise up the screen when jumping
        if(jumping){
            y -= vertspeed;
        }

        //left and right controls
            if (keyhandler.leftPressed) {
                x -= horizontalspeed;
            } else if (keyhandler.rightPressed) {
                x += horizontalspeed;
            }
    }

    //generates a line which has the coordinates of the top of player
    public Line2D.Float playerbounds(){
        return new Line2D.Float(x,y, x+256,y);
    }

    //sets the variables for when you are holding onto a platform
    public void onPlatform(int platformY){
        y = platformY+90;
        jumping = false;
        latched = true;
    }

    //checks to see if the player has touched the top or the bottom of the screen
    public boolean gameover(){
        return( y < 0 || y > 1050-384);
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
