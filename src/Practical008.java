import java.applet.*;
import java.awt.*;

public class Practical008 extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect((getWidth() / 2) - 25, (getHeight() / 2) - 25, 50, 50);
    }
}
