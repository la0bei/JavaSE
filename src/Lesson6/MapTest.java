package Lesson6;

import java.util.HashMap;

/**
 * Created by user01 on 2016/5/4.
 */
public class MapTest
{
    public static void main(String[] args)
    {
        HashMap map = new HashMap();

        String str = new String("zhangsan");

        map.put("a", str);
        map.put("a", str);

        System.out.println(map);
    }
}
