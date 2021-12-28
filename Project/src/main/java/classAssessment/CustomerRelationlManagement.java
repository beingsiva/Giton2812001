package classAssessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomerRelationlManagement {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://localhost:8888/index.php?action=index&module=Home");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
		driver.findElement(By.xpath("//select[@id='qccombo']/following::img[4]")).click();
		driver.findElement(By.name("accountname")).sendKeys("TYSS Industry");
		Select industry= new Select(driver.findElement(By.name("industry")));
		industry.selectByVisibleText("Banking");
		driver.findElement(By.name("button")).click();
		}

}
