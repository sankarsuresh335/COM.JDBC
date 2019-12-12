package TestNg_demo;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sasi_demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		FileInputStream file= new FileInputStream("F:\\Com.collections\\src\\test\\java\\TestNg_demo\\Test data1.xlsx");
		

		XSSFWorkbook worrkbook= new XSSFWorkbook(file);
		
		XSSFSheet sheet=worrkbook.getSheet("sheet1");
		
		int rowcount=sheet.getLastRowNum();
		
		System.out.println("rowcount list"+rowcount);
		
		int coulcount=sheet.getRow(0).getLastCellNum();
		
		System.out.println("couloum list"+coulcount);
		
		for(int i=0;1<rowcount;i++) {
			
			XSSFRow row=sheet.getRow(i);
			
			for(int j=0;j<coulcount;j++) {
				
				String coul=row.getCell(j).toString();
				
				System.out.println(coul);
			}
			
			
			
		}
		
	}

}
