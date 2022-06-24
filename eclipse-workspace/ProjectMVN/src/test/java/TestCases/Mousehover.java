package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mousehover {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.way2automation.com/");
		driver.manage().window().maximize();

		WebElement menu = driver.findElement(By.xpath("//a[normalize-space()='Resources']"));

		Actions action = new Actions(driver);  //create Actions class for Mouse operations
		action.moveToElement(menu).perform();  //Perform Mouse hover or Move to element 
		
		driver.findElement(By.linkText("Blog")).click();

	}

}
