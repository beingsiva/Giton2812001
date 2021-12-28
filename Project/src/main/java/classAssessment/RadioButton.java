package classAssessment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {

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
		driver.findElement(By.name("accountname")).sendKeys("siva12122221");
		WebElement radio = driver.findElement(By.xpath("(//input[@name='assigntype'])[2]"));
		radio.click();

	}

}
