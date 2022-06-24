package Selenium;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Addarrayofelementstocart {

	public static void main(String[] args) {

		String[] itemsneeded = { "Cucumber", "Beetroot", "Potato", "Capsicum", "Banana" };// Store Item needed to be
																							// added in an Array

		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Navigate to URL
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		addItems(driver, itemsneeded);
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter promo code']")).sendKeys("Vasant");
		driver.findElement(By.xpath("//button[normalize-space()='Apply']")).click();
		System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText()); // Invalid code ..!

		String text = driver.findElement(By.xpath("//span[@class='promoInfo']")).getText();
		Assert.assertEquals(text, "Invalid code ..!");

	}

	public static void addItems(WebDriver driver, String[] itemsneeded) {
		int j = 0;
		// Store all the products in a WebElement
		List<WebElement> products = driver.findElements(By.className("product-name"));

		for (int i = 0; i < products.size(); i++) // Iterate all the Items
		{
			List list = Arrays.asList(itemsneeded);
			String[] name = products.get(i).getText().split("-");// Store the Text of the items in string
			String formattedname = name[0].trim();
			if (list.contains(formattedname)) // If Item text matches then click on it
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == itemsneeded.length) // come out of the loop after selecting Array of items
					break;

			}
		}
	}

}
