package com.test.testng.orangeHrm;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utility.ExcelUtility;
import Pages.HomePage;
import Pages.LoginPage;

public class HomepageTest extends Base {

	LoginPage loginPage;
	HomePage homepage;

	public HomepageTest() {
		super();
	}

	// test cases should be separated -- independent with each other
	// before each test case -- launch the browser and login
	// @test -- execute test case
	// after each test case -- close the browser

	@BeforeMethod
	public void createBrowserObject() throws IOException {
		initialization();
		loginPage = new LoginPage();
		homepage = loginPage.login(prop.getProperty("Username"), prop.getProperty("Password"));
	}

	@Test
	public void subscribeBtn() {
		homepage.verifySubscribebtn();

	}

	@Test
	public void assignLeaveTest() {
		homepage.verifyAssignLeave();
	}

	@Test
	public void verifybtnTest() {
		homepage.verifyBtn();
	}

	@Test
	public void myInfoEditBtn() {
		homepage.verifyMyinfoEdit();
	}
	@Test(dataProvider="getData")
	public void VerifyAssignLeaveTest(String empName,String leavetype,String fromDate,String toDate,String DurationValue,String comments) {
		
		//System.out.println(empName+" "+Age);
		homepage.assignPageTest(empName,leavetype,fromDate,toDate,DurationValue,DurationValue);
	}
	

	@AfterMethod
	public void takeScreenshot() {
		//Screenshotutil();
		driver.quit();
		System.out.println("Close browser");
	}
	
	@DataProvider(name="getData")
	public String [][] getData() throws IOException
	{
		/*String loginData[][]= {
								{"admin@yourstore.com","admin","Valid"},
								{"admin@yourstore.com","adm","Invalid"},
								{"adm@yourstore.com","admin","Invalid"},
								{"adm@yourstore.com","adm","Invalid"}
							};*/
		
		//get the data from excel
		String path="C:\\Users\\Vasant\\eclipse-workspace\\testng.orangeHrm2\\src\\test\\java\\Resources\\TestData_OrangeHRM.xlsx";
		ExcelUtility xlutil=new ExcelUtility(path);
		
		int totalrows=xlutil.getRowCount("Sheet1");
		int totalcols=xlutil.getCellCount("Sheet1",1);	
				
		String loginData[][]=new String[totalrows][totalcols];
			
		
		for(int i=1;i<=totalrows;i++) //1
		{
			for(int j=0;j<totalcols;j++) //0
			{
				loginData[i-1][j]=xlutil.getCellData("Sheet1", i, j);
			}
				
		}
		
		return loginData;
	}

}
