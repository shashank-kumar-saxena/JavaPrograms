package insertion;

public class Solution {
    public static void main(String[] args) {
        int a[]={8,7,9,0,6,5,4,3,2,1,2,3,4,5};
        insertion(a);
        for(int i:a)
        {
            System.out.print(i+" ");
        }
    }
    static void insertion(int a[])
    {
        for(int i=1;i<a.length;i++)
        {
            int key=a[i];
            int j=i-1;
            while (j>=0&&key<a[j])
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
        }
    }
}
