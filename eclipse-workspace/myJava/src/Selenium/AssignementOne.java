package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignementOne {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Navigate to website
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();

		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.linkText("16")).click();
		WebElement adult = driver.findElement(By.id("Adults"));

		Select dropdown = new Select(adult);

		Thread.sleep(3000);
		dropdown.selectByValue("5");

		WebElement children = driver.findElement(By.id("Childrens"));
		Select dropdown1 = new Select(children);
		dropdown1.selectByValue("3");

		driver.findElement(By.id("MoreOptionsLink")).click();
		Thread.sleep(3000);

		WebElement Class = driver.findElement(By.id("Class"));
		Select dropdown2 = new Select(Class);
		dropdown2.selectByValue("Business");

		driver.findElement(By.xpath("//input[@id='AirlineAutocomplete']")).sendKeys("ind");

		Thread.sleep(3000);

		List<WebElement> options = driver.findElements(By.xpath("//li[@class='list']"));
		for (WebElement option : options)// iterate all the list elements
		{
			if (option.getText().equalsIgnoreCase("Air India Express (IX)")) // click if we get required element
			{
				option.click();
				break;
			}
		}
		driver.findElement(By.id("SearchBtn")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());

		driver.close();

	}

}
