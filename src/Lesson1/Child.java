package Lesson1;

public class Child extends Parent
{
    public Child()
    {
        super(1);
    }

    public static void main(String[] args)
    {
        Child child = new Child();
    }
}

class Parent
{
    public Parent(int i)
    {
        System.out.println("parent");
    }

	/*
	public Parent()
	{
		System.out.println("no args parent");
	}
	*/
}
