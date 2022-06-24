package JavaBasic;

public class SimpleInheritance {

	public static void main(String[] args) 
	{
	 A obj1=new A();
	 obj1.i=10;
	 obj1.j=11;
	// obj1.Add();
	 A obj2=new A();
	 obj2.i=23;
	 obj2.j=234;
	 obj2.Add();
  
	}

}

class A
{
int i,j;
void Add()
     {
	System.out.println(i+j);
	
     }
}





