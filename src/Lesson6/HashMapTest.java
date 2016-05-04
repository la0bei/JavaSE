package Lesson6;

import java.util.HashMap;

/**
 * Created by user01 on 2016/5/4.
 */
public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "hello");
        map.put("b", "world");
        map.put("c", "welcome");
        map.put("a", "foo");
        map.put("d", "world");

        String value = map.get("a");
        System.out.println(value);
        System.out.println("-----------------");
        String value2 = map.get("b");
        String value3 = map.get("d");
        System.out.println(value2);
        System.out.println(value3);
    }
}
