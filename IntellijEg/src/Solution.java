import  java.util.*;
public class Solution {
    public static void main(String[] args) {
        String s="LLLRRLLR";
        System.out.println(findNumberSequence(s));
    }
    static ArrayList<Integer> findNumberSequence(String s)
    {
        int num[]=new int [s.length()];
        int n=(int)(Math.pow(2,s.length()));
        int a[]={0,n};
        int len=s.length();
        int i=0;
        int res=0;
        while(len>0)
        {
            char c=s.charAt(i);
            if(c=='L') {
                a[1] = (a[0] + a[1]) / 2;
                res=a[1];
            }
            else {
                a[0] = (a[0] + a[1]) / 2;
                res=a[0];
            }
            num[i]=res;
            len--;
            i++;
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(i=0;i<num.length;i++)
        {

                int min=0,j,val=Integer.MAX_VALUE;
                for(j=0;j<num.length;j++)
                {
                    if(num[j]<val&&num[j]!=0) {
                        min = j;
                        val=num[j];
                    }
                }
                    list.add(min+1);
                    num[min]=0;

        }
        return(list);
    }
}
