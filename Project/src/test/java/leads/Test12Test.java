package leads;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.Test;

import com.crm.vtiger.generic.javaUtilities.BaseClasses;

public class Test12Test extends BaseClasses {
	@Test
public void testcase12() throws NoAlertPresentException  {
		driver.findElement(By.name("lastname")).sendKeys("bezo jeff");
		driver.findElement(By.name("company")).sendKeys("amazon");
		driver.findElement(By.name("annualrevenue")).sendKeys("qwerty");
		driver.findElement(By.name("button")).click();
		Alert pop = driver.switchTo().alert();
		String poptext = pop.getText();
		System.out.println(poptext);
		pop.accept();
	
	
}
}
