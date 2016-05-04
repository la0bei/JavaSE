package Lesson3;

/**
 * Created by user01 on 2016/5/3.
 */
public class StringTest
{
    public static void main(String[] args)
    {
        String str = new String("aa");
        String str2 = new String("aa");

        System.out.println(str.equals(str2));

        String str3 = "aa";
        String str4 = "aa";

        System.out.println(str3.equals(str4));

        System.out.println("-----------------");

        Object object = new Object();
        Object object2 = new Object();

        System.out.println(object.equals(object2));
        System.out.println(object.equals(object));

        System.out.println("-----------------");
        String s1 = "hello";
        String s2 = "world";
        String s3 = "helloworld";
        String s4 = s1 + s2;
        System.out.println(s3 == s2 + s1);
        System.out.println(s3.equals(s4));
        System.out.println(s1 + s2);
        System.out.println(s3);
    }
}

