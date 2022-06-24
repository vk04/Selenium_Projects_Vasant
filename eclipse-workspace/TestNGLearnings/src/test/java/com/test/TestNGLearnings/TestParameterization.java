package com.test.TestNGLearnings;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParameterization {
	@Test(dataProvider = "getData")
	public void doLogin(String userName,String password) {
		
		System.out.println(userName+"---"+password);
	}
	
	
	@DataProvider
    public Object[][] getData(){
		Object[][] data = new Object[3][2];
		data[0][0]="Name";
		data[0][1]="Vasant";
		data[1][0]="Age";
		data[1][1]="30";
		data[2][0]="City";
		data[2][1]="Bangalore";
		
		return data;
		
		
	
}
}
