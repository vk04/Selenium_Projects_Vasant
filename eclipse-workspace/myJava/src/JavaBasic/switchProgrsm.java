package JavaBasic;

import java.util.Scanner;

public class switchProgrsm {

	public static void main(String[] args) 
	{
		System.out.println("IMDB Top Movies");
		IMDBtopMovies();
	}
		public static  void IMDBtopMovies() {
		Scanner input = new Scanner(System.in);
		 System.out.println("Enter the Number");
		 int i =input.nextInt();
		 
		switch(i)
		{
		case 1:
			System.out.println("The Shawshank Redemption "+"\n"+ "Rating:9.3");
			break;
		case 2:
			System.out.println("The Godfather"+"\n"+ "Rating:9.3");
			break;
		case 3:
			System.out.println("The Dark Knight"+"\n"+ "Rating:9.3");
			break;
		case 4:
			System.out.println("The Godfather: Part II"+"\n"+ "Rating:9.3");
			break;
		case 5:
			System.out.println("12 Angry Men"+"\n"+ "Rating:9.3");
			break;
		case 6:
			System.out.println("The Lord of the Rings: The Return of the King"+"\n"+ "Rating:9.3");
			break;
		case 7:
			System.out.println("Pulp Fiction"+"\n"+ "Rating:9.3");
			break;
		case 8:
			System.out.println("Schindler's List"+"\n"+ "Rating:9.3");
			break;
		case 9:
			System.out.println("Inception"+"\n"+ "Rating:9.3");
			break;
		case 10:
			System.out.println("Fight Club"+"\n"+ "Rating:9.3");
			break;
		default :
			System.out.println("Wrong Input");
		}
		 
		 
	input.close();
	}
		

}
