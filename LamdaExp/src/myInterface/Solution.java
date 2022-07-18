package myInterface;


interface cal{

    public int add(int a,int b);

}
public class Solution {
    public static void main(String[] args) {
        cal c= (num1,num2)->{
            return(num1+num2);
        };
        System.out.println(c.add(23,32));
    }
}
