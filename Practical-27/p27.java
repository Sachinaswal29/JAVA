/* Write a JFrame having three textfields. The first two textfields refers to two numbers on which Multiplication or division will happen. 
The third textfield will show the result. There are two buttons “Mul” and “Div”. Once user will click on Mul or Div buttons 
then the corresponding result will be displayed in result field. 
*/

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class B extends JFrame implements ActionListener {
    JTextField tf1, tf2, tf3;

    B() {
        setLayout(new FlowLayout());
        JLabel l1 = new JLabel("Enter No 1");
        tf1 = new JTextField(20);
        JLabel l2 = new JLabel("Enter No 2");
        tf2 = new JTextField(20);
        JLabel l3 = new JLabel("Result");
        tf3 = new JTextField(20);
        JButton b1 = new JButton("Mul");
        JButton b2 = new JButton("Div");
        add(l1);
        add(tf1);
        add(l2);
        add(tf2);
        add(b1);
        add(b2);
        add(l3);
        add(tf3);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        int r = 0;

        String s = e.getActionCommand();
        if (s.equals("Mul"))
            r = (Integer.parseInt(tf1.getText())) * (Integer.parseInt(tf2.getText()));
        if (s.equals("Div"))
            r = (Integer.parseInt(tf1.getText())) / (Integer.parseInt(tf2.getText()));
        tf3.setText(Integer.toString(r));
    }

    public static void main(String args[]) {
        B d = new B();
        d.setSize(300, 400);
        d.setVisible(true);
    }
}
