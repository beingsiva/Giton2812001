package leads;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.crm.vtiger.generic.javaUtilities.BaseClasses;

public class TypeOnlyMandatoryFieldTest extends BaseClasses {
	@Test
	public void typeonlymandatoryfield() {
		driver.findElement(By.name("lastname")).sendKeys("sivasakthi");
		driver.findElement(By.name("company")).sendKeys("infosys");
		driver.findElement(By.name("button")).click();
	}
		
}
