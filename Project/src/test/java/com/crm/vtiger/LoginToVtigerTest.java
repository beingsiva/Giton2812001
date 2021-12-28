package com.crm.vtiger;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import fileUtility.PropertyFileUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class LoginToVtigerTest {
	public void ReadingLoginDetailsFromPropertyFile() throws IOException {
		PropertyFileUtility pf= new PropertyFileUtility();
		String un = pf.readDataFromproperty("username");
		String pwd = pf.readDataFromproperty("password");
		String url = pf.readDataFromproperty("Url");
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get(url);
		driver.findElement(By.name("user_name")).sendKeys(un);
		driver.findElement(By.name("user_password")).sendKeys(pwd);
		driver.findElement(By.id("submitButton")).click();
		//http://localhost:8888/index.php?action=Login&module=Users
		
	}

}
