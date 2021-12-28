package practiceJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ExecuteUpdateQuery {

	public static void main(String[] args) throws SQLException {
		//Step:1a.Load the driver
		Driver driverref=new Driver();
		//Step:1b.Register the driver
		DriverManager.registerDriver(driverref);
		//Step2:Establish the connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Students_info", "root", "root");
		//Step3:Create the statement
		Statement stmt = con.createStatement();
		//Step4:Execute the statement
		int result = stmt.executeUpdate("CREATE TABLE STUDENT (STU_NAME VARCHAR(25) NOT NULL, STU_ID INT, PHONE_NO INT NOT NULL, DEPARTMENT VARCHAR(20) NOT NULL,PRIMARY KEY(STU_ID))");
		//step5:process the statement
		if(result==0)
		System.out.println("Table created succussfully");
		else
			System.out.println("Query is not ok");
		//Step6:Close the connection
		con.close();

	}

}
