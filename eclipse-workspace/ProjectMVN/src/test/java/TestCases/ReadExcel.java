package TestCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		File f = new File("D:\\Selenium\\myfile.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook wb = WorkbookFactory.create(fi);

		Sheet sheet0 = wb.getSheetAt(0);
		Row row0 = sheet0.getRow(3);
		Cell cell0 = row0.getCell(0);
		int maxRow=sheet0.getLastRowNum()+1;
		int maxCol=sheet0.getLastRowNum();

		System.out.println("LastCol	:"+row0.getLastCellNum());
		System.out.println("--------------------");
		System.out.println("LastRow	:"+sheet0.getLastRowNum());
		System.out.println("--------------------");

		for (int i = 1; i <maxRow; i++) {
			for (int j = 0; j <maxCol; j++) {
				sheet0 = wb.getSheetAt(0);
				row0 = sheet0.getRow(i);
				cell0 = row0.getCell(j);

				System.out.println(cell0);
			}
		}

	}

}
