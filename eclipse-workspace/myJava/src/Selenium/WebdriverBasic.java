package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverBasic {

	public static void main(String[] args)  {
		//Launch chrome
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//Navigate to website
		driver.get("https://www.saucedemo.com/");
		

		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
		
		driver.findElement(By.linkText("Twitter")).click();
		
		
		
		
		
	}

} 
