package com.crm.vtiger.generic.javaUtilities;

import org.junit.Assert;
import org.testng.annotations.Test;

public class RetryAnalyser {
	
	@Test(retryAnalyzer=com.crm.vtiger.generic.javaUtilities.RetryAnalyzer.class)
public void retryanalymethod() {
		System.out.println("Retry & Retry");
		Assert.assertTrue(false);
		
		
	}
}
