package com.shsnk.WeddingDate;
import java.util.Scanner;
class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

            String S = sc.nextLine();
            String[] s = S.split(" ");
            String dd = s[0];
            String mm = s[1];
            String yy = s[2];
            Solution ob = new Solution();
            String res  = ob.closest_date(dd, mm, yy);
            System.out.println(res);

    }
    public static void freq(int d, int m,int y, int arr[]){
        arr[d%10]++;
        arr[d/10]++;
        arr[m%10]++;
        arr[m/10]++;
        while(y != 0){
            arr[y%10]++;
            y = y/10;
        }
    }
    public static boolean ValidDate(int date, int month,  int year, int[] arr){
        int[] curr = new int[10];
        freq(date,month,year,curr);
        for(int i=0; i<10; i++){
            if(arr[i] != curr[i])
                return false;
        }
        return true;
    }
    public String  closest_date(String date, String month, String year)
    {
        int d = Integer.parseInt(date);
        int m = Integer.parseInt(month);
        int y = Integer.parseInt(year);
        int[] arr = new int[10];

        freq(d,m,y,arr);
        if(m >12 || d > 31){
            return "Invalid Date";
        }
        String ans = "";

        while(y <= 9999){
            d++;
            if(d > 30){
                d = 1;
                m ++;
            }
            if(m > 12){
                m = 1;
                y++;
            }
            if(y > 9999)
                break;
            if(ValidDate(d,m,y,arr)){
                if(d<10)
                    ans = "0"+d+" ";
                else
                    ans = d+" ";

                if(m<10)
                    ans += "0"+m+" ";
                else
                    ans += m+" ";
                ans += y;
                return ans;
            }
        }
        if(y > 9999){
            return "-1";
        }
        return ans;
    }
}