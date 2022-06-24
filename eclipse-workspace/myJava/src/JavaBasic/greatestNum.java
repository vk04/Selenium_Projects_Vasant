package JavaBasic;
import java.util.Scanner;

public class greatestNum {

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1=obj.nextInt();
		System.out.println("Enter the 2nd number");
		int num2=obj.nextInt();
		System.out.println("Enter the 3rd number");
		int num3=obj.nextInt();
		if(num1>num2 && num1>num3)
		{
			System.out.println(num1+" is Greates Number");
		}
		else if(num2>num1 && num2>num3)
		{
			System.out.println(num2+" is Greates Number");
		}
		else if(num3>num1 && num3>num2)
		{
			System.out.println(num3+" is Greatest Number");
		}
		

	}

}
