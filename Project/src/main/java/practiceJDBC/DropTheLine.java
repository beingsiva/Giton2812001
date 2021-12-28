package practiceJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class DropTheLine {

	public static void main(String[] args) throws SQLException {
		//Step1a:Load the Driver
				Driver driver=new Driver();
				DriverManager.registerDriver(driver);
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Students_info", "root", "root");
				Statement stmt = con.createStatement();
				String query= "delete from STUDENT where STU_ID=1111";
				int result1 =stmt.executeUpdate(query);
				if(result1==1) {
				System.out.println("row deleted");
				String query1 = "select* from student";
				ResultSet result = stmt.executeQuery(query1);
				while(result.next()) {
					System.out.println(result.getString(1)+"\t"+result.getString(2)+"\t"+result.getString(3)+"\t"+result.getString(4));
				}
				}
				else
					System.out.println("Row is not deleted");
				con.close();
	}

}
