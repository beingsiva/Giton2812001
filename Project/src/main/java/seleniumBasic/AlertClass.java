package seleniumBasic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertClass {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://testautomationpractice.blogspot.com/");
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		alert.accept();
		System.out.println(text);
		String text1 = driver.findElement(By.id("demo")).getText();
		System.out.println(text1);
		driver.findElement(By.id("age")).sendKeys("25");
		

	}

}
