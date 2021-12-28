package leads;

import org.openqa.selenium.By;

import com.crm.vtiger.generic.javaUtilities.BaseClasses;

public class TestCase16Test extends BaseClasses {
	
	public void testcase16() {
		driver.findElement(By.name("lastname")).sendKeys("Swetha");
		driver.findElement(By.name("company")).sendKeys("flipkart");
		driver.findElement(By.id("email")).sendKeys("sweetarpita");
		driver.findElement(By.id("secondaryemail")).sendKeys("sweetarpita91");
		
		
		
	}

}
