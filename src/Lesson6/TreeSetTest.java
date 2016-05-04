package Lesson6;

import java.util.TreeSet;

/**
 * Created by user01 on 2016/5/4.
 */
public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("D");
        set.add("A");
        set.add("B");
        set.add("E");
        set.add("C");

        System.out.println(set);
    }
}
