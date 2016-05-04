package Lesson6;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by user01 on 2016/5/4.
 */
public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("B");
        set.add("A");
        set.add("D");
        set.add("C");

        for (Iterator<String> iterator = set.iterator(); iterator.hasNext();) {
            String str = iterator.next();
            System.out.println(str);
        }
    }
}
