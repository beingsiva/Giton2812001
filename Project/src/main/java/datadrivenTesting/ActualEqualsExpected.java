package datadrivenTesting;

import static org.testng.Assert.assertEquals;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class ActualEqualsExpected {

	@Test
	public static void equalactualexpect() throws SQLException {
		String expectedvalue="siva";
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Students_info", "root", "root");
		Statement stmt = con.createStatement();
		String query = "select* from emp";
		ResultSet result = stmt.executeQuery(query);
		while(result.next()) {
			String actualvalue=result.getString(1);
			System.out.println(actualvalue);
			assertEquals(actualvalue, expectedvalue);
			
		}
		

	}

}



/*if(actualvalue.equals(expectedvalue)){
System.out.println("student is valid");
}else {
	System.out.println("student is not valid");
}*/