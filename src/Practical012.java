import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Practical012 extends Applet implements ActionListener {
    Button b1 = new Button("Make Green!");
    public void init() {
        setBackground(Color.RED);
        b1.addActionListener(this);
        add(b1);
    }
    public void paint(Graphics g) {
    }
    public void actionPerformed(ActionEvent e) {
        if (getBackground() == Color.RED) {
            setBackground(Color.GREEN);
            b1.setLabel("Make Blue!");
        } else if (getBackground() == Color.GREEN) {
            setBackground(Color.BLUE);
            b1.setLabel("Make Red!");
        } else{
            setBackground(Color.RED);
            b1.setLabel("Make Green!");
        }
    }
}
