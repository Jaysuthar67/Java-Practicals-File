import java.applet.*;
import java.awt.*;
import java.awt.event.*;


public class Practical010 extends Applet implements ActionListener {
    public TextField t1, t2;
    public Label l3;

    public void init() {
        setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));
        Label l1 = new Label("Enter A :");
        Label l2 = new Label("Enter B :");
        l3 = new Label();
        t1 = new TextField(5);
        t2 = new TextField(5);
        Button b1 = new Button("Addition");
        b1.addActionListener(this);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(l3);
    }

    public void actionPerformed(ActionEvent e) {
        double x = Double.parseDouble(t1.getText());
        double y = Double.parseDouble(t2.getText());
        l3.setText(x + " + " + y + " = " + (x + y));
    }
}
