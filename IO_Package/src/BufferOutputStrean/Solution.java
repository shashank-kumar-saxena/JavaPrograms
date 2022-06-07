package BufferOutputStrean;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileOutputStream fo=null;
        FileInputStream fi=null;
        try{
            File f = new File("MyTxt.txt");
            File f2=new File("Write.txt");
            fi = new FileInputStream(f);
            BufferedInputStream br=new BufferedInputStream(fi);
            fo=new FileOutputStream(f2);
            BufferedOutputStream bw=new BufferedOutputStream(fo);
            String s="Shashank Kumar";
            int content;
            while ((content = br.read()) != -1) {
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
