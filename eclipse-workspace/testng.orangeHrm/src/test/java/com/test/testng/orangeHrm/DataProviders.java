package com.test.testng.orangeHrm;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {
	
	@Test(dataProvider ="getData")
	public void displayData(String name) {
		
		System.out.println(name);
		
	}
	@DataProvider
	public Object[][] getData(){
		
		Object[][] data= new Object[1][1];
		
		data[0][0]="abcd";
		
		
		return data;
		
	}

}
