import java.awt.*;
import java.applet.*;
import java.util.Random;

public class SkyGround{
    public static void drawSky(Graphics g){
        g.setColor(Color.black);
        g.fillRect(0,0,1000,500);
    }

    public static void drawGround(Graphics g){
        g.setColor((Color.gray));
        g.fillRect(0, 500, 1000, 650);
    }
    public static void drawMoon(Graphics g){
        g.setColor(Color.white);
        g.fillOval(800, 100, 50, 50);
    }
    public static void drawStars(Graphics g){
        for (int k=0; k<100; k++){
            Random rand = new Random();
            int x1 = rand.nextInt(1000) ;
            int y1 = rand.nextInt(500);
            g.setColor(Color.white);
            g.fillOval(x1, y1, 5, 5);

        } 
    }
}
