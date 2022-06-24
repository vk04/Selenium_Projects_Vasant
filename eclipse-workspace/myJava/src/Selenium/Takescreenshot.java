package Selenium;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Takescreenshot {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Navigate to Web site
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		TakesScreenshot srcshot= ((TakesScreenshot)driver);   //Convert web driver object to TakeScreenshot
		
		File SrcFile =srcshot.getScreenshotAs(OutputType.FILE);  //Call getScreenshotAs method to create image file
		
		File DestFile=new File("D:\\Software Testing\\error.img");
		
		FileUtils.copyFile(SrcFile, DestFile);
		
       

	}

}
