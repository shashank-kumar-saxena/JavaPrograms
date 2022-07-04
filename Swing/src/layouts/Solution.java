package layouts;

import javax.swing.*;
import java.awt.*;

class Window extends JFrame
{
    Container c;
    Window()
    {
        c=this.getContentPane();
        Panel p=new Panel();

        JButton b1,b2,b3,b4,b5;
        b1=new JButton("Button1");
        b2=new JButton("Button2");
        b3=new JButton("Button3");
        b4=new JButton("Button4");
        b5=new JButton("Button5");
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        c.add(p);
    }
}
public class Solution {
    public static void main(String[] args) {
        Window w=new Window();
        w.setVisible(true);
        w.setBounds(10,10,400,400);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
