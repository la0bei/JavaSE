package Lesson6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by user01 on 2016/5/4.
 */
public class MapTest2 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("aa", "hello");
        map.put("bb", "world");
        map.put("cc", "welcome");
        map.put("dd", "foo");
        map.put("ee", "bar");

        Set keySet = map.keySet();

        for (Iterator<String> iterator = keySet.iterator(); iterator.hasNext();) {
            String key = iterator.next();
            String value = map.get(key);
            System.out.println("key: " + key + " " + "value: " + value);
        }
    }
}
