package form;

import javax.swing.*;
import java.awt.*;

class Window extends JFrame
{
    Container c;
    Window()
    {
        c=this.getContentPane();
        c.setLayout(null);
        Font f=new Font("Arial",Font.BOLD,20);
        JLabel heading=new JLabel("Form",SwingConstants.CENTER);
        heading.setSize(100,50);
        heading.setFont(f);
        heading.setLocation(150,20);
        JLabel Uname=new JLabel("Username",JLabel.CENTER);
        Uname.setSize(100,50);
        Uname.setFont(f);
        Uname.setLocation(50,100);
        JTextField t=new JTextField();
        t.setSize(200,50);
        t.setLocation(150,100);
        c.add(Uname);
        c.add(t);
        c.add(heading);

    }
}
public class Solution {
    public static void main(String[] args) {
        Window w=new Window();
        w.setVisible(true);
        w.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        w.setBounds(20,20,500,500);
    }
}
