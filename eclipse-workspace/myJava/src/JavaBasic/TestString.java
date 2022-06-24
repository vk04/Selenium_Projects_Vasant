package JavaBasic;

public class TestString {

	public static void main(String[] args) {
		String str = "Amazon Prime Terms and Conditions";
		
		String[] str1= str.split("and");
		System.out.println(str1[0].trim());
		System.out.println(str1[1].trim());

	}

}
