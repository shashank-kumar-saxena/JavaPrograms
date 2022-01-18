package com.shsnk.passByvalue;

public class Solution
{
    int a=10;
    public int fun(Solution sc)
    {
        sc.a=sc.a+200;
        return (sc.a);
    }
    public static void main(String []args)
    {
        Solution solution=new Solution();
        System.out.println(solution.a);
        System.out.println("After updating value");
        System.out.println(solution.fun(solution));
        System.out.println(solution.a);
    }
}
