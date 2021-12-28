package com.crm.vtiger.generic.javaUtilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.crm.vtiger.webDriverUtilities.WebDriverUtilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClasses{
	public static WebDriver staticDriver;
	public WebDriver driver;
	WebDriverUtilities wdu = new WebDriverUtilities();
	
	@Parameters("browser")
	@BeforeMethod
	public void loginPage(String browser){
		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		
			if(browser.equalsIgnoreCase("chrome"))
			driver= new ChromeDriver();
		else if(browser.equalsIgnoreCase("firefox"))
			driver= new FirefoxDriver();
			staticDriver = driver;
			
		driver.get("http://localhost:8888/index.php?action=index&module=Home");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("(//a[text()='Leads']/following::img[1])[2]")).click();
	}
	
	
	@AfterMethod
	public void Logout() {
		WebElement ele = driver.findElement(By.xpath("//span[text()=' Administrator']/following::img[1]"));
		Actions act= new Actions(driver);
		act.moveToElement(ele).build().perform();
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	}
	
}