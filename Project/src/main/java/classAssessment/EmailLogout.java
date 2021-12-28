package classAssessment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EmailLogout {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://localhost:8888/index.php?action=index&module=Home");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//select[@id='qccombo']/following::img[4]")).click();
		driver.findElement(By.name("accountname")).sendKeys("siva0071");
		WebElement checkbox = driver.findElement(By.name("emailoptout"));
		checkbox.click();
		boolean enabled = checkbox.isEnabled();
		System.out.println(enabled);		
		//driver.findElement(By.name("button")).click();
		WebElement ele = driver.findElement(By.xpath("//span[text()=' Administrator']/following::img[1]"));
		Actions act= new Actions(driver);
		act.moveToElement(ele).build().perform();
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		driver.close();
		
		/*WebElement ele = driver.findElement(By.xpath("(//td[@class='small'])[2]"));
		Actions action=new Actions(driver);
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		*/
	}

}
