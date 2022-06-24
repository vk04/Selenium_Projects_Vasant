package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptexecutorexample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Navigate to Web site
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,600)"); //scroll down the window using JS
		

	}

}
