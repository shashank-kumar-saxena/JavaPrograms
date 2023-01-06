import java.util.Arrays;

public class StringEx {
    public static void main(String[] args) {
        System.out.println(modifyString(13,"Khokharnikunj"));
    }
    public static String modifyString(int N,String str)
    {
            String sp="",sc="";
            for(int i=0;i<N;i++)
            {
                char c= str.charAt(i);
                if(isPrime((int)c))
                {
                    sp=sp+c;
                }
                else
                {
                    sc=sc+c;
                }
            }
        return asc(sp)+des(sc);
    }
    static boolean isPrime(int n)
    {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }
    static String asc(String str)
    {
        char charArray[] = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
    static String des(String str)
    {
        char charArray[] = str.toCharArray();
        boolean b=true;
        int size = charArray.length,temp;
        for(int i = 0; i < size&& b; i++ ) {
            b=false;
            for(int j = 0; j < size-i-1; j++) {
                if(charArray[j]<charArray[j+1]) {
                    temp = charArray[j];
                    charArray[j] = charArray[j+1];
                    charArray[j+1] = (char) temp;
                    b=true;
                }
            }
        }
        return new String(charArray);
    }
}
