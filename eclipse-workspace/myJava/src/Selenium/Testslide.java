package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Testslide {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Navigate to website
		driver.get("https://jqueryui.com/slider/");

		driver.manage().window().maximize();

		driver.switchTo().frame(0); // Select the frame based on Index

		WebElement mainSlider = driver.findElement(By.xpath("//div[@id='slider']"));

		int Width = mainSlider.getSize().width / 2; // Store half of the Slide bar width in a Integer variable

		WebElement slider = driver
				.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));

		new Actions(driver).dragAndDropBy(slider, Width, 0).perform(); //Move slider to half of slide bar

	}

}
