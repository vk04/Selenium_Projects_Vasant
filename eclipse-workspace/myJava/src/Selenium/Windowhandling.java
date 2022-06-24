package Selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Navigate to Web site
		driver.get("https://www.amazon.in/amazonprime");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Amazon Prime Terms and Conditions")).click();
		
		Set<String>windows =driver.getWindowHandles();
		System.out.println(windows);
		java.util.Iterator<String> It= windows.iterator();
		String parent=It.next();
		String child=It.next();
		
		
		driver.switchTo().window(child);
		
		//driver.findElement(By.xpath("//a[normalize-space()='All Help Topics']")).click();
		
		driver.findElement(By.xpath("//h1[normalize-space()='Amazon Prime Terms and Conditions']")).getText();
		

	}

}
