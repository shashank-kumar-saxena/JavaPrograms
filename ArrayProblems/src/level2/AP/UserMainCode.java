package level2.AP;
import java.io.*;
import java.lang.*;
public class UserMainCode {
 public static int Nth_of_AP(int input1,int input2,int input3)
        {
            int b=input2-input1;
            return ( b-1+ (input3-1)*(b));
        }

        public static void main(String[] args)
        {
            int a = 1;
            int d = 2;
            int N = 5;
            System.out.print(Nth_of_AP(5, 8, 4));
        }

}
