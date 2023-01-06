import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArraySort {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("India");
        list.add("Itely");
        list.add("France");
        list.add("Pakistan");
        list.add("China");
        System.out.println(arraySort(list));
    }
    static ArrayList<String> arraySort(ArrayList<String> list)
    {
        Collections.sort(list);
        return list;
    }
}
