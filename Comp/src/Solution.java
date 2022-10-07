import java.util.*;

class Solution
{
    public static void main(String[] args) {
        pattern(5);

    }
    static void pattern(int n)
    {
        int b=1;
        for(int i=1;i<=n;i++)
        {
            b=i%2==0?0:1;
            for(int j=1;j<=i;j++)
            {
                System.out.print(b);
                b=b==1?0:1;
            }
            System.out.println();
        }
    }

}