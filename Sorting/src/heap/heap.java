package heap;

public class heap {
    public static void main(String[] args) {
        int a[]={9,8,7,5,7,5,3,2,4,1,0};
        heapSort(a,a.length);
        for(int i:a)
        {
            System.out.print(i+" ");
        }
    }
    static void heapSort(int a[],int size)
    {
        for(int i=(size-1)/2;i>=0;i--)
        {
            heapify(a,i,size);
        }
        for(int i=size-1;i>=0;i--)
        {
            swap(a,0,i);
            heapify(a,0,i);
        }
    }
    static void heapify(int a[],int i,int size)
    {
        int max=i;
        int left=i*2;
        int right=(i*2)+1;
        if(left<size&&a[left]>a[max])
        {
            max=left;
        }
        if(right<size&&a[right]>a[max])
            max=right;
        if(max!=i)
        {
            swap(a,max,i);
            heapify(a,max,size);
        }
    }
    static void swap(int a[],int x,int y)
    {
        int t=a[x];
        a[x]=a[y];
        a[y]=t;
    }
}
