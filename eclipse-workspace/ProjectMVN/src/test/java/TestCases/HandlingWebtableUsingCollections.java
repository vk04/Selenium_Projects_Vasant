package TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingWebtableUsingCollections {

	public static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		HandlingWebtableUsingCollections obj = new HandlingWebtableUsingCollections();
		obj.displayCountry("Ernst Handel");
	}

	public String displayCountry(String company) {

		List<WebElement> companyCol = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[1]"));
		WebElement countryCol = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr/td[3]"));
		for (WebElement ele : companyCol) {
			String companyName = ele.getText();

			if (companyName.equals(company)) {
				System.out.println(countryCol.getText());

				break;

			}

		}

		return company;
	}

}
