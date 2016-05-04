package Lesson6;

import java.util.*;

/**
 * Created by user01 on 2016/5/4.
 */
public class MapTest3 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("aa", "hello");
        map.put("bb", "world");
        map.put("cc", "welcome");
        map.put("dd", "foo");
        map.put("ee", "bar");

        System.out.println("-----------------------");

        Set<String> keySet = map.keySet();
        for (Iterator<String> iterator1  = keySet.iterator(); iterator1.hasNext();) {
            String key = iterator1.next();
            System.out.println(key);
        }
        System.out.println("-----------------------");

        Collection<String> values = map.values();
        for (Iterator<String> iter = values.iterator(); iter.hasNext();) {
            System.out.println(iter.next());
        }

        System.out.println("----------------------");
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Iterator<Map.Entry<String, String>> iterator = entrySet.iterator(); iterator.hasNext(); ) {
            Map.Entry entry = iterator.next();
            String key = (String)entry.getKey();
            String value = (String)entry.getValue();
            System.out.println("key: " + key + " " + "value: " + value);

        }
        System.out.println("----------------------");
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("d");
        list.add("c");
        list.add("b");
        for (Iterator<String> iter = list.iterator(); iter.hasNext();) {
            String s = iter.next();
            System.out.println(s);
        }
    }
}
