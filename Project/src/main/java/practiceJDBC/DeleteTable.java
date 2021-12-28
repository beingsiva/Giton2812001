package practiceJDBC;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class DeleteTable {

	public static void main(String[] args) throws SQLException {
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Students_info", "root", "root");
		Statement stmt = con.createStatement();
		String query = "drop table student";
		int result = stmt.executeUpdate(query);
		if(result==0){
			System.out.println("Table is deleted successfully");
			}else {
				System.out.println("table is not deleted successfully");
			}
		

	}

}
