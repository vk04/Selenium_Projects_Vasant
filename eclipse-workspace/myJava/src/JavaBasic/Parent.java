package JavaBasic;

public class Parent 
{
public void m1()
{
System.out.println("Parent");	
}
}
class Child extends Parent
{
	public void m2()
	{
		System.out.println("child");
	}
}
class test
{
public static void main(String[] args)
{
	Child n=new Child();
	n.m1();
}
}
