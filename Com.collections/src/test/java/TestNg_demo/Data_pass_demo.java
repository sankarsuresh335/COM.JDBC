package TestNg_demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Data_pass_demo {
	
	
	
	@Test
	public void data() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		
		
		
		FileInputStream file= new FileInputStream("F:\\\\Com.collections\\\\src\\\\test\\\\java\\\\TestNg_demo\\\\Test data1.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
			XSSFSheet sheet=workbook.getSheet("sheet3");
			
			int rowcount=sheet.getLastRowNum();
			System.out.println(rowcount);
			
			int couloumcount =sheet.getRow(0).getLastCellNum();
			
			System.out.println(couloumcount);
			
			for(int i=1;i<=rowcount;i++) {
				
				XSSFRow row=sheet.getRow(i);
				
				String username=row.getCell(0).getStringCellValue();
				String password=row.getCell(1).getStringCellValue();
				
				
				driver.findElement(By.id("txtUsername")).sendKeys(username);
				driver.findElement(By.id("txtPassword")).sendKeys(password);
				
				driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
				
				if(driver.getPageSource().contains("Welcome Admin")) {
					
					System.out.println("regisstion"+row+"completed");
				}
				else {
					
					System.out.println("this is page");
				}
				
				
				
				
					}
				
			}
		
		
		
		
		
		
	}
	


