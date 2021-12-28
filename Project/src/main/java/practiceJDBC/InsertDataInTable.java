package practiceJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class InsertDataInTable {

	public static void main(String[] args) throws SQLException {
		//STEP1A:lOAD THE DRIVER
		Driver driver=new Driver();
		
		//STEP1B:Register the Driver
		DriverManager.registerDriver(driver);
		
		//STEP2:ESTABLISH THE CONNECTION
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Students_info", "root", "root");

		//STEP3:CREATE A STATEMENT
		Statement stmt = con.createStatement();
		
		//STEP4:EXECUTE THE STATEMENT
		int result = stmt.executeUpdate("Insert into student(stu_name, stu_id, phone_no, department) values ('sivasakthi',2222,1134567890,'civil')");
		
		//STEP5:PROCESS THE STATEMENT
		if(result==1)
			System.out.println("Student created succussfully");
		else
			System.out.println("Student was not created succussfully");
		//STEP6:Close the Connection
		con.close();
	
	}

}
