import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Solution {
    public static void main(String[] args) {
        comperatorEg();
    }
    static void comperatorEg(){
        ArrayList<String> list=new ArrayList<>();
        list.add("11");
        list.add("22");
        list.add("1");
        list.add("2");
        list.add("0");
        list.add("222");
        list.add("101");
        list.add("-2");
        System.out.println(list);
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });
        System.out.println(list);
        Collections.sort(list, (i,o)->{
            if(i.compareTo(o)>0)
                return 0;
            else
                return 1;
        });
        System.out.println(list);
    }
}
