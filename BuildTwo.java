import java.awt.*;
import java.applet.*;
public class BuildTwo {
    public static void drawBig(Graphics g){
        g.setColor(Color.darkGray);
        g.fillRect(500, 200,200,400 );

    }
    public static void drawWin(Graphics g){
        g.setColor(Color.yellow);
        g.fillRect(525, 225, 50, 50);
        g.fillRect(525, 325, 50, 50);
        g.fillRect(525, 425, 50, 50);

        g.fillRect(625, 225, 50, 50);
        g.fillRect(625, 325, 50, 50);
        g.fillRect(625, 425, 50, 50);
    }
    public static void drawDoors(Graphics g){
        g.setColor(Color.white);
        g.fillRect(600, 525, 50, 75);
    }

}
