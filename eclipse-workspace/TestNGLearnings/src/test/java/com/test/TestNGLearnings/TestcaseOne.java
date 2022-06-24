package com.test.TestNGLearnings;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestcaseOne extends BaseTest {
	@BeforeMethod
	public void loginPortal() {
		System.out.println("Login into Portal");
	}

	@BeforeTest
	public void launchBrowser() {
		System.out.println("Lounch browser");
	}

	@Test(priority = 1)
	public void pageTitle() {
		System.out.println("Print Page Title ");
	}

	@AfterTest
	public void closeBrowser() {
		System.out.println("Close Browser");
	}

	@AfterMethod
	public void LogoutPortal() {
		System.out.println("Logout Portal");
	}

	@Test(priority = 2)
	public void coutLinksInPortal() {
		System.out.println("Count Links");
	}
	@Test(priority=3 , enabled = true)
	public void VerifyButton() {
		System.out.println("Verify Button");
	}
	

}
