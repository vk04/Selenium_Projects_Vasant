package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstScenario {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("driver.chrome.webdriver", "Path");
		
	   WebDriver driver= new ChromeDriver();
	   
	   driver.get("https://www.amazon.in/");
	   
	   driver.manage().window().maximize();
	   
	   WebDriverWait w= new WebDriverWait(driver, 10);
	   
	   WebElement ele = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	   
	  w.until(ExpectedConditions.visibilityOf(ele));
	  
	  driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Samsung");
	  
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("//input[@value='samsung m12']")).click();
	  
	  driver.findElement(By.xpath("(//div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left']/label/input)[2]")).click();
	  
	  w.until(ExpectedConditions.visibilityOf("(//img[@class='s-image'])[1]"));
	  
	  driver.navigate().to("https://www.flipkart.com/");
	  
	  

	}

}
