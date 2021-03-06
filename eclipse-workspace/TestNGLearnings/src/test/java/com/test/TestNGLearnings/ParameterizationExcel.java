package com.test.TestNGLearnings;

import java.io.IOException;
import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import DataDriven.ExcelUtility;

public class ParameterizationExcel {
public static ReadExcel excel = null;
static int maxRow;
static int maxCol;

	
	@Test(dataProvider="getData")
	public void testData(String user,String pwd){
		
	
		System.out.println(user+"    "+pwd);
		
	}
	
	//Hashtable
	
	
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
		String path="C:\\Users\\Vasant\\eclipse-workspace\\TestNGLearnings\\src\\test\\java\\Resources\\TestData.xlsx";
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
