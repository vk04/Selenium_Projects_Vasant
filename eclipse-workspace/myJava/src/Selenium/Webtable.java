package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//Navigate to website
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		for(int i=1;i<=11;i++)
		{
		System.out.println(driver.findElement(By.xpath("//table[@name='courses']/tbody/tr["+i+"]  ")).getText()+" ");
		}

	}

}
