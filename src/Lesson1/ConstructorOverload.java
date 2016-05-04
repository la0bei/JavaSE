package Lesson1;

/**
 * Created by user01 on 2016/5/3.
 */
public class ConstructorOverload
{
    public ConstructorOverload()
    {
        this(3);

        System.out.println("test");
    }

    public ConstructorOverload(int i)
    {
        System.out.println(++i);
    }

    public static void main(String[] args)
    {
        ConstructorOverload col = new ConstructorOverload();


    }
}
