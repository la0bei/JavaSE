package Lesson1;

/**
 * Created by user01 on 2016/5/3.
 */
public class ReferenceTest
{
    int a = 4;

    public static void main(String[] args)
    {
        ReferenceTest rt = new ReferenceTest();

        ReferenceTest rt2 = new ReferenceTest();

        rt2 = rt;

        rt.a = 5;

        System.out.println(rt.a);

        System.out.println(rt2.a);

    }
}
