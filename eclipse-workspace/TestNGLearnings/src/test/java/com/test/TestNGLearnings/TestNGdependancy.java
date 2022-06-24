package com.test.TestNGLearnings;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGdependancy extends BaseTest {

	public class TestcaseOne {
		@Test(priority = 1) 
		public void Test1() {
			System.out.println("Login into Portal");
			Assert.fail("Unable to login");
		}

		@Test(priority = 2, dependsOnMethods = "Test1",alwaysRun = true)
		public void Test2() {
			System.out.println("Get Page Title");
		}

		@Test(priority = 3, dependsOnMethods = "Test1", alwaysRun = true)
		public void Test3() {
			System.out.println("Count Number of links in Page");   
		}
	}
}
