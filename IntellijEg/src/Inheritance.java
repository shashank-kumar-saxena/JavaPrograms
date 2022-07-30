
class b<T extends Number>
{
    T [] obj;
    b(T[] obj)
    {
        this.obj=obj;
    }
    void show()
    {
        int sum=0;
        for(int i=0;i< obj.length;i++)
        {
            sum=sum+obj[i].intValue();
        }
        System.out.println(sum);
    }
}
public class Inheritance{
    public static void main(String[] args) {
        Integer a[]={1,2,4,3,5,2};
        b<Integer> bb=new b<>(a);
        bb.show();
    }

}

