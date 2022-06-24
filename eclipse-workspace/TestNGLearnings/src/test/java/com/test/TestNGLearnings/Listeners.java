package com.test.TestNGLearnings;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listeners implements ITestListener  {
	
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {


		System.out.println("Passed Test - "+result.getName());
		
	}

	public void onTestFailure(ITestResult result) {

		System.setProperty("org.uncommons.reportng.escape-output","false");
		Reporter.log("<a href= \"C:\\Users\\Vasant\\eclipse-workspace\\ProjectMVN\\Screenshot\\Mon_Jun_07_08_25_30_IST_2021.JPG\" target=\"_blank\">Screenshot link</a>");
		Reporter.log("<br>");
		Reporter.log("<a href=\"C:\\Users\\Vasant\\eclipse-workspace\\ProjectMVN\\Screenshot\\Mon_Jun_07_08_25_30_IST_2021.JPG\" target=\"_blank\"><img height=200 width=200 src=\"C:\\Users\\Vasant\\eclipse-workspace\\ProjectMVN\\Screenshot\\Mon_Jun_07_08_25_30_IST_2021.JPG\"></a>");
		
		
		System.out.println("Capturing Screenshot for the Failed test -- "+result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}


