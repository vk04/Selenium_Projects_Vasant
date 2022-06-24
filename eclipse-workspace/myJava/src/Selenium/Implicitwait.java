package Selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Implicitwait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//WebDriverWait wait = new WebDriverWait(driver, 5);
		
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver) //FluentWait 
				.withTimeout(Duration.ofSeconds(10))           //Wait for 10 Seconds
				.pollingEvery(Duration.ofSeconds(2))   //Checking the element every 2 seconds
				.withMessage("No Element found after 10 sconds") //Print the customized error message for not finding the element
				.ignoring(NoSuchElementException.class); 
		
		

		// Navigate to URL
		driver.get("https://mail.google.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("kvasant55@gmail.com");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='VfPpkd-RLmn12']"))).click(); //explicit Wait
		
		//driver.findElement(By.xpath("//div[@class='VfPpkd-RLmn12']")).click();

	}

}
