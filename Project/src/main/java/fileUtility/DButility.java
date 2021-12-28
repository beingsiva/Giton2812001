package fileUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class DButility {
	Connection con;
	
	public void connectToDataBase() throws SQLException {
		Driver driver= new Driver();
		DriverManager.registerDriver(driver);
		con = DriverManager.getConnection(IpathConstants.JDBCPath, IpathConstants.JDun, IpathConstants.JDpwd);
	}
	public void executeQueryAndFetchData(String query, int colindex, String expdata) throws SQLException {
		ResultSet result = con.createStatement().executeQuery(query);
		boolean flag= false;
		while(result.next()) {
			String actualval = result.getString(colindex);
			if(actualval.equalsIgnoreCase(expdata)){
				System.out.println("valid");
				flag= true;
				break;
			}else{
					System.out.println("invalid");
				}
			}
		}
	public void colseDB() throws SQLException {
		con.close();
	}
	}


