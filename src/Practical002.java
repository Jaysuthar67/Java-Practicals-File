import java.applet.Applet;
import java.awt.*;
@Deprecated
public class Practical002 extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillOval(10, 20, 50, 50);
        g.fillOval(70, 20, 50, 50);
        g.fillOval(130, 20, 50, 50);
        g.fillOval(190, 20, 50, 50);
        g.fillOval(250, 20, 50, 50);
    }
}
