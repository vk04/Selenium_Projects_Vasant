package com.test.testng.orangeHrm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

//Initializing variables or properties
//Author -- Vasanth K

public class Base {

	public static WebDriver driver;
	public static WebDriverWait wait;
	public static String destFile;
	public static Properties prop = new Properties();
	public String propertyPath = "C:\\Users\\Vasant\\eclipse-workspace\\testng.orangeHrm\\src\\test\\java\\ReadingPropertyFile\\TestData.properties";
	public FileReader read;
	public static Date d;
	public String excelFilepath = "D:\\Selenium\\myfile.xlsx";
	public File f;
	public Workbook wb;
	static int maxRow;
	static int maxCol;
	public ArrayList<Object> ar;
	public FileInputStream fi;
	public	Sheet sheet0;
	public	Row row0;
	public	Cell cell0;
	

	public Base() {
		try {
			read = new FileReader(propertyPath);
			f = new File(excelFilepath);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} // Reading property file

		try {
			prop.load(read);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // loading property file
	}

	public static void initialization() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		wait = new WebDriverWait(driver, 10);
		System.out.println("Create Browser Obj");
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();

	}

	public void readExcelData() throws EncryptedDocumentException, IOException {
		FileInputStream fi = new FileInputStream(f);
		Workbook wb = WorkbookFactory.create(fi);
		wb = WorkbookFactory.create(fi);
		sheet0 = wb.getSheetAt(0);
		row0 = sheet0.getRow(3);
		cell0 = row0.getCell(0);
		maxRow = sheet0.getLastRowNum() + 1;
		maxCol = sheet0.getLastRowNum();
		ar = new ArrayList<Object>();
		for (int i = 0; i < maxRow; i++) {

			sheet0 = wb.getSheetAt(0);
			row0 = sheet0.getRow(i);
			cell0 = row0.getCell(1);
			ar.add(cell0);

			System.out.println(cell0);

		}
		// System.out.println(ar.get(0));

	}
}
