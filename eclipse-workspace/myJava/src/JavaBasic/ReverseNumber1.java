package JavaBasic;

public class ReverseNumber1 {

	public static void main(String[] args) {
		int number = 12, reverse = 0;
		for (; number != 0; number = number / 10) {
			int dig = number % 10;
			reverse = reverse * 10 + dig;

		}
		System.out.println("Reverse number is : " + reverse);
	}

}
