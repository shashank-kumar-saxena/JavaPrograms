package merge;

public class Solution {
    public static void main(String[] args) {
        int a[]={2,4,2,1,2,4,6,4,2,4,7,8,9,7,5};
        mergeSort(a,0,a.length-1);
        for(int i:a)
        {
            System.out.print(i+" ");
        }
    }
    static void mergeSort(int a[],int l,int u)
    {
        if(l<u)
        {
            int m=(l+u)/2;
            mergeSort(a,l,m);
            mergeSort(a,m+1,u);
            merge(a,l,m,u);
        }
    }
    static void merge(int a[],int l,int m,int u)
    {
        int temp[]=new int[u-l+1];
        int i=l,j=m+1;
        int k=0;
        while(i<=m&&j<=u)
        {
            if(a[i]>a[j])
            {
                temp[k]=a[j];
                j++;k++;
            }else
            {
                temp[k]=a[i];
                i++;k++;
            }
        }
        while(i<=m)
        {
            temp[k]=a[i];
            i++;k++;
        }
        while(j<=u)
        {
            temp[k]=a[j];
            j++;k++;
        }
        for(i=l;i<=u;i++)
        {
            a[i]=temp[i-l];
        }
    }
}
