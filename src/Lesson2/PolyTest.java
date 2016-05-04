package Lesson2;

/**
 * Created by user01 on 2016/5/3.
 */
public class PolyTest
{
    public static void main(String[] args)
    {
        //Parent parent = new Parent();
        //parent.sing();

        //Child child = new Child();
        //child.sing();

        Parent p = new Child();
        p.sing();
    }
}

class Parent
{

	public void sing()
	{
		System.out.println("parent is singing");
	}

}

class Child extends Parent
{
    public void sing()
    {
        System.out.println("child is singing");
    }
}
