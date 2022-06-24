package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingALerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//Navigate to website
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("name")).sendKeys("Vasant");
		
		//Thread.sleep(3000);
		
		driver.findElement(By.id("alertbtn")).click();
		
		//Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
		
		//Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("confirmbtn")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		
		//Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
	}

}
