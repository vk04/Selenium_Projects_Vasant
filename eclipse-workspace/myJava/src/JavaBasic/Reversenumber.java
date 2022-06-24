package JavaBasic;

public class Reversenumber {

	public static void main(String[] args) {
		long num=45876970;
		
		String num1= String.valueOf(num);
		char[] c=num1.toCharArray();
		System.out.println("Reverse number is");
		for(int i=c.length-1;i>=0;i--)
		{
			System.out.print(c[i]);
		}

	}

}
