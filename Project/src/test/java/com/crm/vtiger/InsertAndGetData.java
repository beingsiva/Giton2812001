package com.crm.vtiger;

import java.sql.SQLException;

import org.testng.annotations.Test;

import fileUtility.DButility;

public class InsertAndGetData {
	@Test
	public void insertdata() throws SQLException {
		DButility DButil= new DButility();
		DButil.connectToDataBase();
		DButil.executeQueryAndFetchData("select* from emp where emp_id=1111", 1, "siva");
		DButil.colseDB();
		
	}

}
