import java.applet.*;
import java.awt.*;

public class Practical001 extends Applet {
    public void paint(Graphics g) {
        Font f = new Font("Arial", Font.ITALIC, 24);
        g.setFont(f);
        g.setColor(Color.BLUE);
        g.drawString("Welcome", ((getWidth()/2)-45), (getHeight()/2));
    }
}
