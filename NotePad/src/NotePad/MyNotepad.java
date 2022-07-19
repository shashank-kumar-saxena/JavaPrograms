package NotePad;

import java.awt.FileDialog;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;
class FileHandling {
    Notepad n;
    Path path;
    String fdata;
    String filename=null;
    String filepath=null;
    FileHandling(Notepad n){
        this.n=n;

    }
    void newFile() {
        n.data.setText(null);
    }
    void cutFile() {
        n.data.cut();
    }
    void copyFile() {
        n.data.copy();
    }
    void pasteFile() {
        n.data.paste();
    }
    void selectAllFile() {
        n.data.selectAll();
    }
    void printFile() {
        try {
            n.data.print();
        } catch (PrinterException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    void saveFile() {
        BufferedWriter bw;
        try {
            bw = new BufferedWriter(new FileWriter(filepath));
            bw.write(n.data.getText());
            bw.close();
            n.setTitle(filename);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    void saveAsFile() {
        JFileChooser fd =new JFileChooser();
        File currentDir =new File(System.getProperty("user.dir"));
        fd.setCurrentDirectory(currentDir);
        FileNameExtensionFilter filter=new FileNameExtensionFilter("Text File(.txt|.java)","txt","java");
        fd.setAcceptAllFileFilterUsed(false);
        fd.addChoosableFileFilter(filter);
        int choose=fd.showSaveDialog(n);
        //FileDialog fd =new FileDialog(n,"Open",FileDialog.LOAD);
        //fd.setVisible(true);
        if(choose==JFileChooser.APPROVE_OPTION) {
            filename=fd.getSelectedFile().getName();
            filepath=fd.getSelectedFile().getAbsolutePath().toString();
            //System.out.println(filepath+filename);

            try {
                BufferedWriter bw =new BufferedWriter(new FileWriter(filepath));
                bw.write(n.data.getText());
                bw.close();
                n.setTitle(filename);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    void openFile() {
        JFileChooser fd =new JFileChooser();
        File currentDir =new File(System.getProperty("user.dir"));
        fd.setCurrentDirectory(currentDir);
        FileNameExtensionFilter filter=new FileNameExtensionFilter("Text File(.txt|.java)","txt","java");
        fd.setAcceptAllFileFilterUsed(false);
        fd.addChoosableFileFilter(filter);
        int choose=fd.showOpenDialog(n);
        //FileDialog fd =new FileDialog(n,"Open",FileDialog.LOAD);
        //fd.setVisible(true);
        if(choose==JFileChooser.APPROVE_OPTION) {
            filename=fd.getSelectedFile().getName();
            filepath=fd.getSelectedFile().getAbsolutePath().toString();
            //System.out.println(filepath+filename);
            path=Path.of(filepath);
            try {
                fdata =Files.readString(path);
                n.data.setText(fdata);
                n.setTitle(filename);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
class Notepad extends JFrame implements ActionListener{
    JMenuBar mb;
    JMenu file,edit, help;
    JMenuItem fnew,open,save,saveas,print,exit,cut,copy,paste,selectall;
    JTextArea data;
    FileHandling filehandle;
    JScrollPane scrollPane;
    Notepad(){
        filehandle=new FileHandling(this);
        data=new JTextArea();
        scrollPane=new JScrollPane(data);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        data.setFont(new Font("Arial",Font.PLAIN,20));
        //Menu
        file=new JMenu("File");
        fnew=new JMenuItem("New");
        fnew.addActionListener(this);
        fnew.setActionCommand("new");
        fnew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,KeyEvent.CTRL_DOWN_MASK));
        open=new JMenuItem("Open");
        open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,KeyEvent.CTRL_DOWN_MASK));
        open.setActionCommand("open");
        open.addActionListener(this);
        save=new JMenuItem("Save");
        save.setActionCommand("save");
        save.addActionListener(this);
        saveas=new JMenuItem("SaveAs");
        saveas.setActionCommand("saveas");
        saveas.addActionListener(this);
        print=new JMenuItem("Print");
        print.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,KeyEvent.CTRL_DOWN_MASK));
        print.setActionCommand("print");
        print.addActionListener(this);
        exit=new JMenuItem("Exit");
        exit.setActionCommand("exit");
        exit.addActionListener(this);
        file.add(fnew);
        file.add(open);
        file.add(save);
        file.add(saveas);
        file.add(print);
        file.addSeparator();
        file.add(exit);
        //edit menu
        edit=new JMenu("Edit");
        cut=new JMenuItem("Cut");
        cut.addActionListener(this);
        cut.setActionCommand("cut");
        copy=new JMenuItem("Copy");
        copy.addActionListener(this);
        copy.setActionCommand("copy");
        paste=new JMenuItem("Paste");
        paste.setActionCommand("paste");
        paste.addActionListener(this);
        selectall=new JMenuItem("SelectAll");
        selectall.setActionCommand("selectall");
        selectall.addActionListener(this);
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.addSeparator();
        edit.add(selectall);
        //help menu
        help=new JMenu("Help");
        help.setActionCommand("help");

        //MenuBar
        mb=new JMenuBar();
        mb.add(file);
        mb.add(edit);
        mb.add(help);
        //setMenuBar
        this.setJMenuBar(mb);
        this.add(scrollPane);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        String items=e.getActionCommand();
        switch(items) {
            case "new": filehandle.newFile();break;
            case "open": filehandle.openFile();break;
            case "save": filehandle.saveFile();break;
            case "saveas": filehandle.saveAsFile();break;
            case "print": filehandle.printFile();break;
            case "exit": System.exit(0);break;
            case "cut": filehandle.cutFile();break;
            case "copy": filehandle.copyFile();break;
            case "paste": filehandle.pasteFile();break;
            case "selectall": filehandle.selectAllFile();break;
        }
    }
}
public class MyNotepad {

    public static void main(String[] args)  {
        // TODO Auto-generated method stub
        //	UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        Notepad n =new Notepad();
        n.setTitle("Untitled");
        n.setSize(800,600);
        n.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        n.setLocationRelativeTo(null);
        n.setVisible(true);
    }

}