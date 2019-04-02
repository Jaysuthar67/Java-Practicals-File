import java.applet.Applet;
import java.awt.*;

public class Practical007 extends Applet {

    public void paint(Graphics g) {
        g.setColor(Color.red);
        int x = 10;

        for (int i = 0; i < 10; i++) {
            g.fillOval((getWidth() / 2) - 30, x, 50, 50);
            x = x + 60;
        }
//         x = 43;
//        Font f = new Font("Roboto", Font.BOLD, 24);
//        for (int i = 1; i <= 10; i++) {
//            g.setFont(f);
//            g.setColor(Color.WHITE);
//            if (i == 10) {
//                g.drawString(Integer.toString(i), (getWidth() / 2)-16, x);
//            } else {
//                g.drawString(Integer.toString(i), (getWidth() / 2) - 11, x);
//            }
//            x = x + 60;
//        }

    }
}
