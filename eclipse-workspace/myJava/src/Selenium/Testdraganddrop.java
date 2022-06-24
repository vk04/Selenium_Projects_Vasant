package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Testdraganddrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		Actions action = new Actions(driver);

		// Navigate to website
		driver.navigate().to("https://jqueryui.com/droppable/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.switchTo().frame(0);
		
		WebElement draggable= driver.findElement(By.id("draggable"));
		WebElement droppable= driver.findElement(By.id("droppable"));
		
		action.dragAndDrop(draggable, droppable).perform();

	}

}
