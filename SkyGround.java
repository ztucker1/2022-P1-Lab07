import java.awt.*;
import java.applet.*;

public class SkyGround{
    public static void drawSky(Graphics g){
        g.setColor(Color.blue);
        g.fillRect(0,0,1000,325);
    }

    public static void drawGround(Graphics g){
        g.setColor((Color.gray));
        g.fillRect(0, 325, 1000, 650);
    }
}
