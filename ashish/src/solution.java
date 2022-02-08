public class solution {
    public static void main(String[] args) {
        int a[]={9,9,9,9,9,9,9};
        int max=a[0],secMax=0;
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];//use to store largest value
            }
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=max)
            {
                secMax=a[i];
            }
        }
        System.out.println(secMax);
    }
}
