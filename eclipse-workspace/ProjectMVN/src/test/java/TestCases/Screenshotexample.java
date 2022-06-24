package TestCases;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshotexample {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		Date d = new Date();
		String fileName = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Navigate to Web site
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		// driver.manage().window().maximize();
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); //call Screenshot method and store in a file
		FileUtils.copyFile(screenshot, new File(".//screenshot//" + fileName)); //copy file from source to destination file

	}

}
