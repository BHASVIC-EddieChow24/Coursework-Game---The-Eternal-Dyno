import java.awt.*;

public class Platform {
    public int x, y;
    public Image ledge;

    public Platform(int x, int y, Image ledge) {
        this.x = x;
        this.y = y;
        this.ledge = ledge;
    }

    public void update(int scrollspeed){
        y+=scrollspeed;
    }

    public void draw(Graphics g){
        g.drawImage(ledge,x,y,null);
    }

}
