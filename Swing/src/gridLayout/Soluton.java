package gridLayout;

import javax.swing.*;
import java.awt.*;

public class Soluton {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(20,20,500,500);
        JButton b1,b2,b3,b4,b5;
        b1=new JButton("center");
        b2=new JButton("rigth");
        b3=new JButton("botto,");
        b4=new JButton("top");
        b5=new JButton("left");
        frame.add(b1, BorderLayout.CENTER);
        frame.add(b2, BorderLayout.WEST);
        frame.add(b3, BorderLayout.EAST);
        frame.add(b4, BorderLayout.SOUTH);
        frame.add(b5, BorderLayout.NORTH);
    }
}
