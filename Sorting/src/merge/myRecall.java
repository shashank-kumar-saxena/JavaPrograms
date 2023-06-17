package merge;

import java.util.Arrays;

public class myRecall {
    public static void main(String[] args) {
        int a[]={9,88,7,6,5,4,3,2,1};
        sort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
    static void sort(int[]a,int l,int u)
    {
        if(l<u)
        {
            int m=(l+u)/2;
            sort(a,l,m);
            sort(a,m+1,u);
            work(a,l,m,u);
        }
    }
    static void work(int a[],int l,int m,int u)
    {
        int temp[]=new int[u-l+1];
        int i=l;//use for first array
        int j=m+1;//use for second array
        int k=0;//use for temporary array
        while (i<=m&&j<=u)
        {
            if(a[i]<a[j])
            {
                temp[k++]=a[i++];
            }
            else {
                temp[k++]=a[j++];
            }
        }
        while(i<=m)
        {
            temp[k++]=a[i++];
        }
        while(j<=u)
        {
            temp[k++]=a[j++];
        }
        for(i=l;i<=u;i++)
        {
            a[i]=temp[i-l];
        }
    }
}
