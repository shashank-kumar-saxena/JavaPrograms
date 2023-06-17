package bubble;

public class Solution {
    public static void main(String[] args) {
        int a[]={9,8,7,6,5,4,3,2,1,0,11};
        bubble(a);
        for(int i:a)
        {
            System.out.print(i+" ");
        }
    }
    static void bubble(int a[])
    {
        boolean b=true;
        for(int i=0;i<a.length&&b;i++)
        {
            b=false;
            for(int j=0;j<a.length-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                    b=true;
                }
            }
        }
    }
}
