package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Testresize {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		Actions action=new Actions(driver);

		// Navigate to website
		driver.navigate().to("https://jqueryui.com/resizable/");
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		
		driver.switchTo().frame(0);
		
		WebElement resize= driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		System.out.println(resize.getSize());
		action.dragAndDropBy(resize, 100, 80).perform();
		System.out.println(resize.getSize());

		
		
		
	}

}
