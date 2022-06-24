package com.qa.OR.keywordDriven.engine;

import com.qa.OR.keyword.base.Base;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KeywordEngine {

	public WebDriver driver; // declare driver object

	public Properties prop; // declare property object

	public static Workbook book;

	public static Sheet sheet;

	String locatorValue = null;

	String locatorName = null;

	public Base base;

	public WebElement ele;
	
	public static ThreadLocal<Workbook> testBook = new ThreadLocal<Workbook>();
	public static ThreadLocal<Sheet> testSheet = new ThreadLocal<Sheet>();

	public final String SCENARIO_SHEET_PATH = "C:\\Users\\Vasant\\eclipse-workspace\\KeywordDrivenOrangeHRM\\src\\main\\java\\com\\qa\\OR\\keywordDriven\\scenarios\\Scenarios.xlsx";

	public void startExecution(String sheetName) {

		FileInputStream file = null;
		try {
			file = new FileInputStream(SCENARIO_SHEET_PATH);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		try {
			book = WorkbookFactory.create(file);
			testBook.set(book);
			
		} catch (EncryptedDocumentException e) {

			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		sheet = book.getSheet(sheetName);
        testSheet.set(sheet);
		int k = 0;
		for (int i = 0; i < testSheet.get().getLastRowNum(); i++) {

			try {
				String locatorColValue = testSheet.get().getRow(i + 1).getCell(k + 1).toString().trim();
				if (!locatorColValue.equalsIgnoreCase("NA")) {

					locatorName = locatorColValue.split("=")[0].trim();
					locatorValue = locatorColValue.split("=")[1].trim();

				}

				String action = testSheet.get().getRow(i + 1).getCell(k + 2).toString().trim();
				String testData = testSheet.get().getRow(i + 1).getCell(k + 3).toString().trim();

				switch (action) {
				case "open":
					base = new Base();
					prop = base.init_property();
					if (testData.isEmpty() || testData.equalsIgnoreCase("NA")) {
						driver = base.init_driver(prop.getProperty("browser"));
					} else {
						driver = base.init_driver(testData);
					}

					break;

				case "lounch URL":
					if (testData.isEmpty() || testData.equalsIgnoreCase("NA")) {
						driver.get(prop.getProperty("URL"));
					} else {
						driver.get(testData);
					}
					break;
				case "quit":
					driver.quit();
					break;

				default:
					break;

				}
				switch (locatorName) {
				case "id":
					WebElement ele = driver.findElement(By.id(locatorValue));
					if (action.equalsIgnoreCase("sendkeys")) {
						ele.clear();
						ele.sendKeys(testData);
					} else if (action.equalsIgnoreCase("click")) {
						ele.click();
					}
					locatorName = null;
					break;

				case "xpath":
					ele = driver.findElement(By.xpath(locatorValue));
					if (action.equalsIgnoreCase("sendkeys")) {
						ele.clear();
						ele.sendKeys(testData);
					} else if (action.equalsIgnoreCase("click")) {
						ele.click();
					}
					locatorName = null;
					break;

				default:
					break;
				}

			} catch (Exception e) {

			}

		}
	}

}
