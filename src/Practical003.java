import java.applet.*;
import java.awt.*;

public class Practical003 extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.red);
        int x = 10;
        for (int i = 0; i < 5; i++) {
            g.fillOval(x, 20, 50, 50);
            x = x + 60;
        }
    }
}
