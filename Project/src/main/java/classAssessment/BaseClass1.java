package classAssessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass1 {
	public WebDriver driver;
	//@BeforeMethod
	public void loginpage() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("http://localhost:8888/index.php?action=index&module=Home");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		driver.manage().window().maximize();
	}
	//@AfterMethod
public void Close() {
		WebElement ele = driver.findElement(By.className("small"));
		Actions act= new Actions(driver);
		act.moveToElement(ele).perform();
		WebElement Element = driver.findElement(By.xpath("//a[text()='Sign Out']"));
		act.moveToElement(Element).build().perform();
		//driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	}
}
