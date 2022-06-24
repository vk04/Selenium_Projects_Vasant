package TestCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWriteExcel {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet0= wb.createSheet("First_Sheet");
		
		Row row0=sheet0.createRow(3);
		Cell cellA = row0.createCell(4);
		Cell cellB = row0.createCell(1);
		
		
		cellA.setCellValue("Kulkarni");
		cellB.setCellValue("Almel");
		
		//connecting Streams
		
		File f=new File("D:\\Selenium\\myfile2.xlsx");
		FileOutputStream fo= new FileOutputStream(f);
		
		wb.write(fo);
		
		//closing the stream
		
		fo.close();
		System.out.println("File Created !!");
		
		
		

	}
}
