import java.applet.*;
import java.awt.*;

public class Practical005 extends Applet {
    int cntInit, cntStart, cntStop, cntDestroy;

    public void init() {
        cntInit++;
    }

    public void start() {
        cntStart++;
    }

    public void stop() {
        cntStop++;
    }

    public void destroy() {
        cntDestroy++;
        System.out.println("Destroy =" + cntDestroy);
    }


    public void paint(Graphics g) {
        g.drawString("Init =" + cntInit, 20, 20);
        g.drawString("Start =" + cntStart, 20, 40);
        g.drawString("Stop =" + cntStop, 20, 60);
        g.drawString("Destroy =" + cntDestroy, 20, 80);
    }
}
