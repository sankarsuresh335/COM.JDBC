package TestNg_demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataDrivem_Demo {
	
	@Test
	public void data_driven_demo () throws IOException {
		
		FileInputStream file= new FileInputStream("F:\\Com.collections\\src\\test\\java\\TestNg_demo\\Test data1.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		XSSFSheet sheet=workbook.getSheet("sheet1");
		
		int rowcount =sheet.getLastRowNum();
		
		int couloumcount=sheet.getRow(0).getLastCellNum();
		
		
		for(int i=0;i<rowcount;i++) {
			
			XSSFRow row=sheet.getRow(i);
			
			for(int j=0;j<couloumcount;j++) {
				
				String couloumvalu=row.getCell(j).toString();
				
				System.out.println(couloumvalu);
				
				
				
				
			}
			
		}
		
		
		
		
		
		
		
		
	}

}
