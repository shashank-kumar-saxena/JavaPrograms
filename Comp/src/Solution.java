import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        int a[]={1,2,3};
        System.out.println(findYearX(123,a));
    }
    static int findYearX(int n,int d[])
    {
        HashSet<Integer> list=new HashSet<>();
        for(int i:d)
        {
            list.add(i);
        }
        while(true)
        {
            int cpy=n;
            int flag=1;
            while (cpy>0)
            {
                int r=cpy%10;
                if(list.contains(r))
                {
                    flag=0;
                    break;
                }
                cpy=cpy/10;
            }
            if(flag==1)
                return n;
            n++;
        }
    }
}
