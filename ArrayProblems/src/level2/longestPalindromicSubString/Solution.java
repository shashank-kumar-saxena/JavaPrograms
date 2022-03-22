package level2.longestPalindromicSubString;
class Solution {
    public int longestPalindrome(String input1) {
        String s=input1;
        if(s==null || s.equals(""))
            return 0;
        int size=s.length();
        if(size==1)
            return s.length();
        int leftMax=0;
        int rigthMax=0;
        int p=0;
        while(p<size-1){
            if(s.charAt(p)==s.charAt(p+1)){
                int left=p;
                int rigth=p+1;
                while(rigth<size && left>=0){
                    if(s.charAt(left)!=s.charAt(rigth)){
                        break;
                    }
                    left--;
                    rigth++;
                }
                if(rigth-left-1>rigthMax-leftMax){
                    rigthMax=rigth-1;
                    leftMax=left+1;
                }
            }
            if(rigthMax>=size)
                return s.substring(leftMax).length();
            if(p+1<size && p-1>=0 && s.charAt(p-1)==s.charAt(p+1)){
                int left=p-1;
                int rigth=p+1;
                while(rigth<size && left>=0){
                    if(s.charAt(left)!=s.charAt(rigth)){
                        break;
                    }
                    left--;
                    rigth++;

                }
                if(rigth-left-1>rigthMax-leftMax){
                    rigthMax=rigth-1;
                    leftMax=left+1;
                }
            }
            if(rigthMax>=size)
                return s.substring(leftMax).length();
            p++;
        }
        return s.substring(leftMax,rigthMax+1).length();
    }

    public static void main(String[] args) {
        String s="umeaylnlfd";
        Solution sc=new Solution();
        System.out.println(sc.longestPalindrome(s));
    }
}
