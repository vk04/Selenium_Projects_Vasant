package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Navigate to website
		driver.get("https://www.itgeared.com/demo/1506-ajax-loading.html");

		driver.manage().window().maximize();
		explicitWait(driver);

	}

	public static void explicitWait(WebDriver driver) {
		driver.findElement(By.xpath("//a[normalize-space()='Click to load get data via Ajax!']")).click();

		//System.out.println(driver.findElement(By.xpath("//div[@id='results']")).getText());
		WebDriverWait wait=new WebDriverWait(driver, 5);
		System.out.println(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='results']"))).getText());
	}

}
