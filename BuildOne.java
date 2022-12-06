import java.awt.*;
import java.applet.*;
public class BuildOne {

    public static void drawMain(Graphics g){
        g.setColor(Color.darkGray);
        g.fillRect(100, 100,300,500 );

    }
    public static void drawWindow(Graphics g){
        g.setColor(Color.yellow);
        g.fillRect(150, 150, 50, 50);
        g.fillRect(150, 250, 50, 50);
        g.fillRect(150, 350, 50, 50);
        g.fillRect(150, 350, 50, 50);
        g.fillRect(150, 450, 50, 50);

        g.fillRect(300, 150, 50, 50);
        g.fillRect(300, 250, 50, 50);
        g.fillRect(300, 350, 50, 50);
        g.fillRect(300, 350, 50, 50);
        g.fillRect(300, 450, 50, 50);
    }
    public static void drawDoor(Graphics g){
        g.setColor(Color.white);
        g.fillRect(200, 525, 50, 75);
    }
        }
