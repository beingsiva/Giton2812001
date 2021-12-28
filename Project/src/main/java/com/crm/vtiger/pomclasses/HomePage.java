package com.crm.vtiger.pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.vtiger.webDriverUtilities.WebDriverUtilities;

public class HomePage extends WebDriverUtilities {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	

}
