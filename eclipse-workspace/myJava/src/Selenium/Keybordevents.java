package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keybordevents {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Navigate to website
		driver.get("https://www.google.co.in");

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Automation");

		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform(); // Pressing Enter Button
		//action.sendKeys(Keys.chord(Keys.CONTROL +"a")).perform(); // Press COntrol +A but not working
		
		//action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform(); //Press Control + a
		
		WebElement link= driver.findElement(By.xpath("//h3[normalize-space()='What is Automation? - Definition from Techopedia']"));
		link.sendKeys(Keys.CONTROL);
		

	}

}
