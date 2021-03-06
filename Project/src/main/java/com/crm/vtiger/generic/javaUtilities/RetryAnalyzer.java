package com.crm.vtiger.generic.javaUtilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

	private int count=0;
	private int retryCount=3;
	
	
	public boolean retry(ITestResult result) {
		while(count<retryCount) 
		{
			count++;
			return true;
			}
		return false;
	}
	

}
