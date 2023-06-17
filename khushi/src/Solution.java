import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        int Arr[]={257};
        System.out.println(nearlyLucky(Arr));
     }
    public static int nearlyLucky(int []Arr)
    {
        int count=0,sum=0;
        for(int i=0;i<Arr.length;i++)
        {
            int n=Arr[i];
            do {
                while (n > 0) {
                    sum = sum + n % 10;
                    n = n / 10;
                }
                n=sum;
            }while (sum>10);
            if(fact(sum,Arr[i]))
            {
                count++;
            }
        }
        return count;
    }
    static boolean fact(int n,int num)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        HashSet<Integer> list=new HashSet<>();
        while(f>0)
        {
            list.add(f%10);
            f=f/10;
        }
        while (num>0)
        {
            if(list.contains(num%10))
            {

            }
            else
            {
                return false;
            }
            num=num/10;
        }
        return true;
    }
}
