import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Practical009 extends JApplet implements ActionListener {
    JTextField txtName;
    JLabel lblAns;
    public void init() {
        Container c = getContentPane();
        c.setLayout(new FlowLayout(FlowLayout.LEFT,20,0));
        JButton btnDisplay = new JButton("Display");
        txtName = new JTextField(20);
        btnDisplay.addActionListener(this);
        lblAns = new JLabel();
        Label l1 = new Label("Enter Your Name :");
        c.add(l1);
        c.add(txtName);
        c.add(btnDisplay);
        c.add(lblAns);
    }
    public void actionPerformed(ActionEvent e) {
        lblAns.setText("Your Name is : " + txtName.getText());
    }
}
