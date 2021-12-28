package com.crm.vtiger.dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	@Test(dataProvider ="bookTicketDataProvider")
	public void ticketBooking(String src, String dest) {
		System.out.println("Ticket booking confirmed from "+src+" to "+dest);
		System.out.println("Have a happy journey");
	}
	@DataProvider Object[][] bookTicketDataProvider(){
		Object[][] obj= new Object[5][2];
		obj[0][0]="Chennai";
		obj[0][1]="Bangalore";
		
		obj[1][0]="Chennai";
		obj[1][1]="kerala";
		
		obj[2][0]="Chennai";
		obj[2][1]="mangalore";
		
		obj[3][0]="Chennai";
		obj[3][1]="singapore";
		
		obj[4][0]="Chennai";
		obj[4][1]="malaysia";
		return obj;
	}
	
}
