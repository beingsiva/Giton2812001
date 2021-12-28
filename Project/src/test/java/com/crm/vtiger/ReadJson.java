package com.crm.vtiger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import fileUtility.JsonFileUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadJson {

	@Test
	public void data() throws Exception {
		JsonFileUtility js= new JsonFileUtility();
		String un =js.readDataFromJson("username");
		String pwd = js.readDataFromJson("password");
		String url =js.readDataFromJson("Url");
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get(url);
		driver.findElement(By.name("user_name")).sendKeys(un);
		driver.findElement(By.name("user_password")).sendKeys(pwd);
		driver.findElement(By.id("submitButton")).click();
		
		
		
		
	}
}
