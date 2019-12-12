package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_DEMO_EXCER {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		//Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/thala?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
				"root", "root");
		
		Statement stm=con.createStatement();
		
		String g="insert into dell.hcl values(75,'hari',6565,'engg')";
		
		String k="insert into dell.hcl values(85,'hari',6565,'engg')";
		
		String de="delete from dell.hcl where ID=85";
		
		String up="update dell.hcl set EMP_NAME='sasikala' where ID=75";
		
		String se="select Emp_NAME,EMP_ID from dell.hcl";
		
		ResultSet re=stm.executeQuery(se);
		
		while(re.next()) {
			
			String username=re.getString(1);
			int password=re.getInt(2);
			
			System.out.println(username+password);
		}
		
		
		
		
		con.close();
		
		System.out.println("this is the output");

	}

}
