package com.qa.OR.keyword.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//Create Base Class
public class Base {

	public WebDriver driver; // declare driver object

	public Properties prop; // declare property object

	// Initialize driver

	public WebDriver init_driver(String BrowserName) {

		if (BrowserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\chromedriver.exe");
			
		   
			if (prop.getProperty("headless").equals("yes")) {
				// headless mode
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--headless");
				driver = new ChromeDriver(options);

			} else {
				driver = new ChromeDriver();
			}
		}
		return driver;
	}

	// initialize property file

	public Properties init_property() {
		prop = new Properties();
		try {
			// read file into ip object
			FileInputStream ip = new FileInputStream(
					"C:\\Users\\Vasant\\eclipse-workspace\\KeywordDrivenOrangeHRM\\src\\main\\java\\com\\qa\\OR\\keywordDriven\\config\\config.properties");
			try {
				prop.load(ip);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		return prop;
	}

}
