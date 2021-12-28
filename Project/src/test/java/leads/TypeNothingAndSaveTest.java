package leads;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.crm.vtiger.generic.javaUtilities.BaseClasses;

public class TypeNothingAndSaveTest extends BaseClasses {
	@Test
	public void typenothingandsave() {
		driver.findElement(By.name("button")).click();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		Alert popup = driver.switchTo().alert();
		String pop = popup.getText();
		System.out.println(pop);
		popup.dismiss();
	}

}
