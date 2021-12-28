package classAssessment;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateMemberOf extends BaseClass1 {
	@Parameters("browser")
	@Test
	public void createmember(){
		/*WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://localhost:8888/index.php?action=index&module=Home");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		driver.manage().window().maximize();*/
		//PomClass pc =new PomClass();
		//pc.org();
		driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//select[@id='qccombo']/following::img[4]")).click();
		driver.findElement(By.name("accountname")).sendKeys("Anu pdsq1hsarmacy");
		Select industry= new Select(driver.findElement(By.name("industry")));
		industry.selectByVisibleText("Healthcare");
		driver.findElement(By.xpath("//td[text()='Member Of 			']/following::img[1]")).click();
		String parentWindow= driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		for(String curWindow : allWindows){
		    driver.switchTo().window(curWindow);
		}
		driver.findElement(By.xpath("//a[text()='TYSS Industry']")).click();
		Alert popup= driver.switchTo().alert();
		popup.accept();
		driver.switchTo().window(parentWindow);
		driver.findElement(By.name("button")).click();
}
	}