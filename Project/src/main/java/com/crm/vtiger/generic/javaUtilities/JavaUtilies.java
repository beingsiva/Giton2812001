package com.crm.vtiger.generic.javaUtilities;

import java.util.Date;
import java.util.Random;

public class JavaUtilies {

	public int getRandomNumber() {
		Random rdm = new Random();
		int Rnum = rdm.nextInt();
		return Rnum;
	}
	
	public String systemData() {
		Date date = new Date();
		String dateval = date.toString();
		return dateval;
	}
}
