package gridBag;

import javax.management.remote.JMXConnectorFactory;
import javax.swing.*;
import java.awt.*;

public class Solution {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        f.setBounds(20,20,500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setLayout(new GridLayout(2,1));
        JButton b1,b2,b3,b4,b5;
        b1=new JButton("Button1");
        b2=new JButton("Button2");
        b3=new JButton("Button3");
        b4=new JButton("Button4");
        b5=new JButton("Button5");
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);

    }
}
