package Lesson1;

/**
 * Created by user01 on 2016/5/3.
 */
public class StaticTest {
    int a = 1;
    public static void main(String[] args) {
        StaticTest st = new StaticTest();
        st.method();
    }
    public void method()
    {
        System.out.println(a);
        method2();
    }
    public void method2()
    {

    }
}
