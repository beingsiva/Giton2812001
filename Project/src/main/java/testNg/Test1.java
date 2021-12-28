package testNg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class Test1 {
	public void test1() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),\"with Textbox \")]")).click();
		driver.findElement(By.xpath("//button[contains(text(),\"demonstrate the prompt box \")]")).click();
		Alert popup = driver.switchTo().alert();
		String popup1 = popup.getText();
		System.out.println(popup1);
		Thread.sleep(3000);
		popup.sendKeys("sivasakthi");
		popup.accept();
		String name = driver.findElement(By.id("demo1")).getText();
		System.out.println(name);
	}

}
