package com.crm.vtiger.generic.javaUtilities;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.ITestListener;


public class Listener extends BaseClasses implements ITestListener {

	public void onTestStart(ITestResult result) {
		
	}

	public void onTestSuccess(ITestResult result) {

	}

	public void onTestFailure(ITestResult result) {

		try {
			wdu.takeScreenshot(BaseClasses.staticDriver, result.getName()+wdu.getSystemDate().replace(" ", "_").replace(":","_" ));
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
		
	}
	

}
