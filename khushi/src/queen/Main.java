package queen;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        findQueen(6);
    }
    static void findQueen(int n) throws InterruptedException {
        int a[][]=new int[n][n];
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                a[i][j]=0;
            }
        }
        find(a,n,0);
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
                Thread.sleep(250);
            }

            System.out.println();
        }
    }

    private static boolean find(int[][] a,int n,int j) {
        if(j>=n)//1>=4
            return true;
        for(int i=0;i<a.length;i++)
        {
            if(isSafe(a,i,j))
            {
                a[i][j]=1;
                if(find(a,n,j+1))
                    return true;
            }
            a[i][j]=0;
        }
        return false;
    }
    /*
    1 0 1 0
    1 0 0 0
    0 0 0 1
    0 1 0 0

    00 01 02 03
    10 11 12 13
    20 21 22 23
    30 31 32 33
         */
    private static boolean isSafe(int[][] a,int i,int j) {

//            for(int k=0;k<a.length;k++)
//            {
//                for(int l=0;l<a.length;l++)
//                {
//                    if(a[k][l]==a[i][j])
//                        continue;
//                    if(k-l==i-j&&a[k][l]==1)
//                        return false;
//                    if(k+l==i+j&&a[k][l]==1)
//                        return false;
//                    if(a[i][k]==1||a[k][j]==1)
//                        return false;
//                }
//            }
//               return true;
        for(int l=0;l<j;l++) {
            if(a[i][l]==1)
                return false;
        }
        for(int k=i,l=j;l>=0&&k>=0;k--,l--){
            if (a[k][l]==1)
                return false;
        }
        for(int k=i,l=j;l>=0&&k<a.length;k++,l--){
            if (a[k][l]==1)
                return false;
        }
        return true;
    }


}
//import java.util.*;
//
//public class Test {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int p=sc.nextInt();
//        ArrayList<String> list=new ArrayList<String>();
//        ArrayList<Integer> ans=new ArrayList<Integer>();
//        for(int j=0;j<p;j++)
//        {
//            String s=sc.next();
//            String st=sc.nextLine();
//            char c=st.charAt(0);
//            if(s.equals("add"))
//            {
//                list.add(st);
//            }
//            else
//            {
//                int count=0;
//                for(String i:list)
//                {
//                    if(i.indexOf(st)==0)
//                    {
//                        count++;
//                    }
//                }
//                ans.add(count);
//            }
//        }
//        for(int i: ans)
//        {
//            System.out.println(i);
//        }
//    }
//}

