package JavaBasic;

import java.util.Scanner;

public class forLoop {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		 System.out.println("Enter the Number");
		 int res = 0;
		 int j =input.nextInt();
		 System.out.println("Multiplication of "+j+"  is ");
		
		 for(int i=1;i<=10;i++)
        {
           res=j*i; 
           System.out.println(res);
        }
        //System.out.println("Multiplication: " + res);
       input.close();
	}

}
