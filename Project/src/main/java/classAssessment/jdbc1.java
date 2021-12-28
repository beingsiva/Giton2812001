package classAssessment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class jdbc1 {

	public static void main(String[] args) throws SQLException {
		Driver driver= new Driver();
		DriverManager.registerDriver(driver);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Students_info", "root", "root");
		Statement stmt = con.createStatement();
		int result1 = stmt.executeUpdate("INSERT INTO Emp(emp_name, emp_id) values('siva',2222)");
		ResultSet data = stmt.executeQuery("Select* from Emp");
		if(result1==1) {
			System.out.println("row created successfully");
			while(data.next()) {
				System.out.println(data.getString(1)+data.getString(2));
				}
			
		}else {
			System.out.println("row is not created");
		}
	}

}
