package Selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestivedropdown {

	public static void main(String[] args) throws InterruptedException {
		//Launch Browser
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//Navigate to URL
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("Ita");
		Thread.sleep(3000);
		List<WebElement> options=driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
		
		for(WebElement option:options)//iterate all the list elements
		{
			if(option.getText().equalsIgnoreCase("Italy")) //click if we get required element
			{
				option.click();
				break;
			}
		}
		
	}

}
