package Lesson6;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by user01 on 2016/5/4.
 */
public class TreeSetTest3 {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>(new MyComparator());
        set.add("D");
        set.add("A");
        set.add("B");
        set.add("C");

        for(Iterator<String> iterator = set.iterator(); iterator.hasNext();) {
            String str = iterator.next();
            System.out.println(str);
        }
    }
}
class MyComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
}
