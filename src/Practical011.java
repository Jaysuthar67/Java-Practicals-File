import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Practical011 extends Applet implements ActionListener {
    Button b1 = new Button("Click Me!");
    public void init() {
        b1.addActionListener(this);
        add(b1);
    }

    public void paint(Graphics g) {
    }

    public void actionPerformed(ActionEvent e) {
        if (b1.getLabel() == "Start") {
            b1.setLabel("Stop");
        } else {
            b1.setLabel("Start");
        }
    }
}
