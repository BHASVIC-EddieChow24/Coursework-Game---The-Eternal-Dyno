import java.awt.*;

//creating the class and the variables
public class Platform {
    public int x, y;
    public Image ledge;

    //setting the rules for the platforms
    public Platform(int x, int y, Image ledge) {
        this.x = x;
        this.y = y;
        this.ledge = ledge;
    }

    //update function
    public void update(int scrollspeed){
        y+=scrollspeed;
    }


    public void draw(Graphics g){
        g.drawImage(ledge,x,y, 384, 256, null);
    }

}
