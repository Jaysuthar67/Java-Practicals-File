import java.applet.*;
import java.awt.*;

public class Practical006 extends Applet {
    public void paint(Graphics g) {
       // Font f = new Font("Arial", Font.BOLD, 24);
        g.setColor(Color.GRAY);
        g.fillOval((getWidth() / 2) - 50, (getHeight() / 2) - 50, 100, 100);
//        g.setFont(f);
        g.setColor(Color.white);
        g.drawString("Jay", (getWidth() / 2) - 7, (getHeight() / 2) + 6);
    }
}
