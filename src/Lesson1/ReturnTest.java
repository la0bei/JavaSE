package Lesson1;

/**
 * Created by user01 on 2016/5/3.
 */
public class ReturnTest
{
    public void method(int a)
    {
        if(a < 3)
        {
            System.out.println(++a);
            return;
        }

        System.out.println(++a);

    }

    public static void main(String[] args)
    {
        ReturnTest rt = new ReturnTest();

        rt.method(2);
    }
}
