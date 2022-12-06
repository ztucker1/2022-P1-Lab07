import java.awt.*;
import java.applet.*;

public class City extends Applet{
    public void paint(Graphics g){
        SkyGround.drawSky(g);
        SkyGround.drawGround(g);
        SkyGround.drawMoon(g);
        SkyGround.drawStars(g);

        BuildOne.drawMain(g);
        BuildOne.drawWindow(g);
        BuildOne.drawDoor(g);

        BuildTwo.drawBig(g);
        BuildTwo.drawWin(g);
        BuildTwo.drawDoors(g);

    }
}
