package quick;

public class Solution {
    public static void main(String[] args) {
        int a[]={1,3,2,4,6,4,8,9,5,3};
        quick(a,0,a.length-1);
        for(int i:a)
        {
            System.out.print(i+" ");
        }
    }
    static void quick(int a[],int l,int u)
    {
        if(l<u)
        {
            int index=partition(a,l,u);
            quick(a,l,index-1);
            quick(a,index+1,u);
        }
    }
    static int partition(int a[],int l,int u)
    {
        int pivot =a[u];
        int index=l-1;
        while(l<u)
        {
            if(a[l]<pivot)
            {
                index++;
                int t=a[l];
                a[l]=a[index];
                a[index]=t;
            }
            l++;
        }
        index++;
        int t=a[u];
        a[u]=a[index];
        a[index]=t;
        return index;
    }
}
