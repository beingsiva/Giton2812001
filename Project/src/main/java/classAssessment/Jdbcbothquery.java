package classAssessment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Jdbcbothquery {

	public static void main(String[] args) throws SQLException {
		Driver driver= new Driver();
		DriverManager.registerDriver(driver);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Students_info", "root", "root");
		Statement stmt = con.createStatement();
		int result = stmt.executeUpdate("CREATE table Emp(emp_name VARCHAR(20) NOT NULL, emp_id int, PRIMARY KEY(emp_id))");
		if(result==0) {
		System.out.println("table created successfully");
		}else {
			System.out.println("Table not created successfully");
			}
		}

}
