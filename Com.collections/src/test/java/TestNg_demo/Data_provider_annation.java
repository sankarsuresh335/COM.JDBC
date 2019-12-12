package TestNg_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_provider_annation {
	
	
	String[][] data={ {"Admin", "admin123"},
						{"Admin","ADmin"},
						{"ADMIN","ADDD"},
						{"admama","addkd"} };
	
	@DataProvider(name="loginprovider")
	public String[][] dtata() {
		
		return data;
		
	}
	
	@Test(dataProvider="loginprovider")
	public void passdata(String username ,String password) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		
		driver.close();
		
		
		
		
	}
	
	


}




