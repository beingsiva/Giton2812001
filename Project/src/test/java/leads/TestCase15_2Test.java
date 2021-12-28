package leads;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.crm.vtiger.generic.javaUtilities.BaseClasses;

public class TestCase15_2Test extends BaseClasses {
	@Test
	public void testcase15_2() {
		driver.findElement(By.name("lastname")).sendKeys("Swetha");
		driver.findElement(By.name("company")).sendKeys("flipkart");
		driver.findElement(By.id("email")).sendKeys("sweetarpita91@gmail.com");
		driver.findElement(By.id("secondaryemail")).sendKeys("sweetarpita91@gmail.com");
		driver.findElement(By.name("button")).click();

}
}
