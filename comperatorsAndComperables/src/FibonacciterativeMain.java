import java.util.Scanner;

public class FibonacciterativeMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s1=sc.nextInt();
        int s2=sc.nextInt();
        int n=sc.nextInt();
        System.out.print(s1+" "+s2);
        n-=2;
        while (n>0)
        {
            int c=s1+s2;
            System.out.print(" "+c);
            s1=s2;
            s2=c;
            n--;
        }
    }
}
