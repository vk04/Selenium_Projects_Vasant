package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addelementstocart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Navigate to website
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//Store all the products in a WebElement
		List<WebElement> products=driver.findElements(By.className("product-name"));
		
		for(int i=0;i<products.size();i++) //Iterate all the Items
		{
			String name=products.get(i).getText(); //Store the Text of the items in string
			if(name.contains("Cucumber"))  //If Item text matches then click on it
			{
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				break;
			}
		}
		

	}

}
