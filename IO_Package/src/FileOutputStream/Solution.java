package FileOutputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileOutputStream fo=null;
        FileInputStream fi=null;
        try{
            File f = new File("MyTxt.txt");
            File f2=new File("Write.txt");
            fi = new FileInputStream(f);
            fo=new FileOutputStream(f2);
            String s="Shashank Kumar";
            int content;
            while ((content = fi.read()) != -1) {
                fo.write((char)content);
            }
        }catch (Exception e)
        {
            System.out.println("File Not found");
        }finally {
            fo.close();
        }
    }
}
