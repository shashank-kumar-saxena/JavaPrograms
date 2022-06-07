class B
{
    void disp()
    {
        System.out.println("This is class A");
    }
}
class A<T extends B>
{
    T obj;
    public A(T obj)
    {
        this.obj=obj;
    }
    void msg()
    {
        obj.disp();
    }
}

public class BoundType {
    public static void main(String[] args) {
        B b=new B();
        A<B> a=new A<>(b);
        a.msg();
    }
}
