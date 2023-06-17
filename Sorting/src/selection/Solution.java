package selection;

public class Solution {
    public static void main(String[] args) {
        int a[]={9,8,7,8,5,4,6,8,4,2,2,1};
        insertion(a);
        for(int i:a)
        {
            System.out.print(i+" ");
        }
    }
    static void insertion(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            int max=Integer.MAX_VALUE,index=-1;
            for(int j=i;j<a.length;j++)
            {
                if(max>a[j])
                {
                    max=a[j];
                    index=j;
                }
            }
            int t=a[index];
            a[index]=a[i];
            a[i]=t;
        }
    }
}
