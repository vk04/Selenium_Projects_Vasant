package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/* Iterate company 
 * if company has Austrailia as country
 * then print Austrailia
 *  */

public class HandlingDynamicTable {

	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		HandlingDynamicTable obj = new HandlingDynamicTable();
		obj.displayCountryName("Laughing Bacchus Winecellars");
	}

	public String displayCountryName(String company) {

		for (int i = 2; i < 8; i++) {

			String company1 = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[" + i + "]/td[1]"))
					.getText();
			if (company1.equals(company)) {
				String country = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[" + i + "]/td[3]"))
						.getText();
				System.out.println("Required Country is :" + country);

				break;
			}
		}

		return company;
	}

}
