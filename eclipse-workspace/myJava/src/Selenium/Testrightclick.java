package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testrightclick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		Actions action = new Actions(driver);

		// Navigate to website
		driver.navigate().to("http://deluxe-menu.com/popup-mode-sample.html");

		driver.manage().window().maximize();

		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebDriverWait wait=new WebDriverWait(driver,5);

		WebElement image = driver.findElement(By.xpath("//img[@src='data-samples/images/popup_pic.gif']"));
		action.contextClick(image).perform();

		WebElement productInfo = driver.findElement(By.xpath("//td[@id='dm2m1i1tdT']"));
		WebElement installation = driver.findElement(By.xpath("//td[@id='dm2m2i1tdT']"));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[@id='dm2m1i1tdT']")));
	
		action.moveToElement(productInfo).build().perform();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[@id='dm2m2i1tdT']")));
		
		action.moveToElement(installation).build().perform();
		
		
		
		

		driver.findElement(By.xpath("//td[@id='dm2m3i1tdT']")).click();

	}

}
