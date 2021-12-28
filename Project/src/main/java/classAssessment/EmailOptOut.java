package classAssessment;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class EmailOptOut extends BaseClass1 {
	
	
	@Test
	public void Email() {
		driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//select[@id='qccombo']/following::img[4]")).click();
		driver.findElement(By.name("accountname")).sendKeys("harimedicals");
		WebElement checkbox = driver.findElement(By.name("emailoptout1"));
		checkbox.click();
		boolean enabled = checkbox.isEnabled();
		System.out.println(enabled);
		driver.findElement(By.name("button")).click();

	}

}
