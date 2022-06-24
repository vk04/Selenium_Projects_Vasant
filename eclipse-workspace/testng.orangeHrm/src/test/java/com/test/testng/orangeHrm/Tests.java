package com.test.testng.orangeHrm;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

//Creating Test Cases for each scenarios
//Reading Test Data from Property file

public class Tests extends Base {

	public String destFile;
	public Properties prop = new Properties();
	public String propertyPath = "C:\\Users\\Vasant\\eclipse-workspace\\testng.orangeHrm\\src\\test\\java\\ReadingPropertyFile\\TestData.properties";
	public FileReader read;

	@BeforeTest
	public void createBrowserObject() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		wait = new WebDriverWait(driver, 10);
		System.out.println("Create Browser Obj");

	}

	@Test
	public void launchBrowser() throws IOException {
		read = new FileReader(propertyPath); // Reading property file

		prop.load(read);// loading property file

		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@id='txtUsername']"))));

		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(prop.getProperty("Username"));
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(prop.getProperty("Password"));
		driver.findElement(By.xpath("//input[@name='Submit']")).click();

		WebElement ele = driver.findElement(By.xpath("//b[normalize-space()='Dashboard']"));

		wait.until(ExpectedConditions.visibilityOf(ele));

		System.out.println("Lounch Browser");

	}

	@Test(dependsOnMethods = "launchBrowser", priority = 1)
	public void verifySubscribebtn() {
		try {
			WebElement verifySubscribe = driver.findElement(By.xpath("//input[@value='Subscribe']"));
			assertEquals(verifySubscribe.isDisplayed(), true);
		} catch (NoSuchElementException e) {
			System.err.println(e);
		}
	}

	@Test(dependsOnMethods = "launchBrowser", priority = 2)
	public void verifyAssignLeave() {
		String str = driver.findElement(By.xpath("//span[contains(text(),'Assign Leave')]")).getText();
		assertEquals(str, "Assign Leave");
	}

	@Test(dependsOnMethods = "launchBrowser", priority = 3)
	public void verifyBtn() {

		driver.findElement(By.xpath("//b[normalize-space()='Maintenance']")).click();

		boolean ver = driver.findElement(By.xpath("//input[@value='Verify']")).isDisplayed();

		assertEquals(ver, true);
	}

	@Test(dependsOnMethods = "launchBrowser", priority = 4)
	public void verifyMyinfoEdit() {
		driver.findElement(By.xpath("//b[normalize-space()='My Info']")).click();

		WebElement ele1 = driver.findElement(By.xpath("//a[normalize-space()='Contact Details']"));
		wait.until(ExpectedConditions.elementToBeClickable(ele1));

		boolean ver2 = driver.findElement(By.xpath("//input[@id='btnSave']")).isDisplayed();
		assertEquals(ver2, true);
	}

	@AfterTest
	public void closeBrowser() {

		driver.close();
		System.out.println("Close browser");
	}

	@AfterMethod
	public void takeScreenshot() {
		Date d = new Date();
		String fileName = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); // call Screenshot method and
																						// store in a file
		try {
			destFile = ".//screenshot//" + fileName;
			FileUtils.copyFile(screenshot, new File(destFile));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // copy file from source to destination file

	}

}
