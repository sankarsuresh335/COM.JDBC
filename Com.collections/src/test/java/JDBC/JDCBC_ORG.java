package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JDCBC_ORG {

	public static WebDriver driver;

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/thala?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
				"root", "root");

		Statement sta = con.createStatement();

		String table = "select *from org.orgg";

		ResultSet re = sta.executeQuery(table);

		while (re.next()) {

			String username = re.getString(2);
			String password = re.getString(3);

			System.out.println("username :" + username + " : password :" + password);
			
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://opensource-demo.orangehrmlive.com");
			
			driver.manage().window().maximize();
			

			driver.findElement(By.id("txtUsername")).sendKeys(username);
			driver.findElement(By.id("txtPassword")).sendKeys(password);
			driver.findElement(By.id("btnLogin")).click();
			
			driver.close();

		}

		con.close();

		System.out.println("this is the output ");

	}

}
