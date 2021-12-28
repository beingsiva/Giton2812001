package leads;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.crm.vtiger.generic.javaUtilities.BaseClasses;

public class TestCase14Test extends BaseClasses {
	@Test
	public void testcase14() {
	driver.findElement(By.name("lastname")).sendKeys("bezo jeff");
	driver.findElement(By.name("company")).sendKeys("amazon");
	driver.findElement(By.id("noofemployees")).sendKeys("qwerty");
	driver.findElement(By.name("button")).click();
	Alert popup = driver.switchTo().alert();
	String text = popup.getText();
	System.out.println(text);
	popup.accept();
}
}