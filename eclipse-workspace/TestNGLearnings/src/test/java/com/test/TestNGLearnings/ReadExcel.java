package com.test.TestNGLearnings;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {
	static int maxRow;
	static int maxCol;

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		File f = new File("D:\\Selenium\\myfile.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook wb = WorkbookFactory.create(fi);

		Sheet sheet0 = wb.getSheetAt(0);
		Row row0 = sheet0.getRow(3);
		Cell cell0 = row0.getCell(0);
	     maxRow=sheet0.getLastRowNum()+1;
		maxCol=sheet0.getLastRowNum();

		System.out.println("LastCol	:"+row0.getLastCellNum());
		System.out.println("--------------------");
		System.out.println("LastRow	:"+sheet0.getLastRowNum());
		System.out.println("--------------------");
		ArrayList<Object> ar = new ArrayList<Object>();
		for (int i = 0; i <6; i++) {
			
				sheet0 = wb.getSheetAt(0);
				row0 = sheet0.getRow(i);
				cell0 = row0.getCell(1);
				ar.add(cell0);

				System.out.println(cell0);
			
		}
		System.out.println(ar.get(0));
		

	}

}
