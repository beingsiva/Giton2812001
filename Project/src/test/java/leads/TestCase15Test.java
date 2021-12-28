package leads;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.crm.vtiger.generic.javaUtilities.BaseClasses;

public class TestCase15Test extends BaseClasses {

	@Test
	public void testcase() {
		driver.findElement(By.name("lastname")).sendKeys("bezo jeff");
		driver.findElement(By.name("company")).sendKeys("amazon");
		driver.findElement(By.id("email")).sendKeys("sweetarpita91@gmail.com");
		driver.findElement(By.id("secondaryemail")).sendKeys("sambit.17@gmail.com");
		driver.findElement(By.name("button")).click();
		
	}
	}

