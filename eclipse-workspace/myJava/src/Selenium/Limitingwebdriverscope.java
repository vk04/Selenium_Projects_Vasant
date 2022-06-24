package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Limitingwebdriverscope {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Navigate to website
		driver.get("https://www.cleartrip.com/");

		driver.manage().window().maximize();
		
		System.out.println("Links on whole page:  "+driver.findElements(By.tagName("a")).size());

		WebElement footerDriver = driver.findElement(By.xpath("//footer[@class='container globalFooter']"));

		System.out.println("Links in Footer:  "+footerDriver.findElements(By.tagName("a")).size());

	}

}
