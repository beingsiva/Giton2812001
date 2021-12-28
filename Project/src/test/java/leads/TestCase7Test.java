package leads;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.crm.vtiger.generic.javaUtilities.BaseClasses;

public class TestCase7Test extends BaseClasses { 
	@Test
	public void testcase7() {
		Select sirname=new Select(driver.findElement(By.name("salutationtype")));
		sirname.selectByVisibleText("Dr.");
		driver.findElement(By.name("firstname")).sendKeys("Tony");
		driver.findElement(By.name("lastname")).sendKeys("stark");
		driver.findElement(By.name("company")).sendKeys("Avenger");
		driver.findElement(By.id("designation")).sendKeys("CEO");
		Select source=new Select(driver.findElement(By.name("leadsource")));
		source.selectByVisibleText("Cold Call");
		Select indus=new Select(driver.findElement(By.name("industry")));
		indus.selectByVisibleText("Education");
		driver.findElement(By.name("annualrevenue")).sendKeys("10000");
		driver.findElement(By.id("noofemployees")).sendKeys("20");
		driver.findElement(By.id("secondaryemail")).sendKeys("noah@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("1234567890");
		driver.findElement(By.id("mobile")).sendKeys("9876543211");
		driver.findElement(By.id("fax")).sendKeys("1234567890");
		driver.findElement(By.id("email")).sendKeys("siva@gmail.com");
		driver.findElement(By.name("website")).sendKeys("www.website.com");
		Select status=new Select(driver.findElement(By.name("leadstatus")));
		status.selectByVisibleText("Qualified");
		Select rate=new Select(driver.findElement(By.name("rating")));
		rate.selectByVisibleText("Active");
		driver.findElement(By.xpath("(//input[@name='assigntype'])[2]")).click();
		Select group=new Select(driver.findElement(By.name("assigned_group_id")));
		group.selectByVisibleText("Support Group");
		driver.findElement(By.name("button")).click();
		
	}

}
