package Lesson3;

/**
 * Created by user01 on 2016/5/3.
 */
public class SingletonTest {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2);
    }
}
class Singleton
{
    private static Singleton singleton;
    private Singleton()
    {

    }
    public static Singleton getInstance()
    {
        if (singleton == null)
            singleton = new Singleton();
        return singleton;
    }
}
