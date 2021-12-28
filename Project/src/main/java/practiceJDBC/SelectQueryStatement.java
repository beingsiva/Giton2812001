package practiceJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class SelectQueryStatement {

	public static void main(String[] args) throws SQLException {
		//Step1a:Load the Driver
		Driver driver=new Driver();
		
		//STEP1b:Register the Driver
		DriverManager.registerDriver(driver);
		
		//STEP2:Establish the connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Students_info", "root", "root");
		
		//STEP3:Create the statement
		Statement stmt = con.createStatement();
		
		//STEP4:Establish the statement
		String query = "select* from student";
		ResultSet result = stmt.executeQuery(query);
		while(result.next()) {
			System.out.println(result.getString(1)+"\t"+result.getString(2)+"\t"+result.getString(3)+"\t"+result.getString(4));
		}
		con.close();

	}

}
