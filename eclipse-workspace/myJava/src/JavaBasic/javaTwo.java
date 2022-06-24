package JavaBasic;

import java.util.Scanner;

public class javaTwo {
	

	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the Number");
		 int num =sc.nextInt();
		 
		 if(num>0)
		 {
			 System.out.println(num+" is Positive Number");
		 }
		 else {
			 System.out.println(num+" is Negative Number");
		 }
		 
			
	}

}
