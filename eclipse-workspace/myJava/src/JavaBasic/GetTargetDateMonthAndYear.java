package JavaBasic;

public class GetTargetDateMonthAndYear {

	public static void main(String[] args) {
		String dateString = "15/9/2021";

		// Returns the index of mentioned string
		int firstIndex = dateString.indexOf("/");

		// Returns the index of mentioned string
		int lastIndex = dateString.lastIndexOf("/");

		System.out.println(firstIndex + " " + lastIndex);
		
		String day = dateString.substring(0, firstIndex);
		int targetDay = Integer.parseInt(day);
		System.out.println(targetDay);

	}

}
