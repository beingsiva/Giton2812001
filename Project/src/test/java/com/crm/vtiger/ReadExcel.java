package com.crm.vtiger;

import java.io.IOException;

import org.testng.annotations.Test;

import fileUtility.ExcelFileUtility;


public class ReadExcel {

	@Test
	public void readdata() throws IOException, Exception {
		ExcelFileUtility EF=new ExcelFileUtility();
		for(int i=0;i<=1;i++) {
			for(int j=1;j<=10;j++) {
		String data = EF.readFromExcelFile("Sheet1", j, i);
		System.out.println(data);
			}
		}
	}
}
