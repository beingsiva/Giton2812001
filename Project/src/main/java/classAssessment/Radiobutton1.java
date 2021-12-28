package classAssessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radiobutton1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email_create")).sendKeys("sivaakfoaishf@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();
		Thread.sleep(10000);
		WebElement gender = driver.findElement(By.id("id_gender2"));
		// import on WebElement//
		gender.click();
		driver.findElement(By.id("customer_firstname")).sendKeys("devaghhgdgh");
		driver.findElement(By.id("customer_lastname")).sendKeys("karthik");
		driver.findElement(By.id("passwd")).sendKeys("Siva2@123");
		Select date = new Select(driver.findElement(By.id("days")));
		// import on select//
		date.selectByVisibleText("10  ");
		Select month = new Select(driver.findElement(By.id("months")));
		month.selectByVisibleText("June ");
		Select year = new Select(driver.findElement(By.id("years")));
		year.selectByVisibleText("2017  ");
		WebElement newsletter = driver.findElement(By.id("newsletter"));
		newsletter.click();
		WebElement optin = driver.findElement(By.id("optin"));
		optin.click();
		driver.findElement(By.id("firstname")).sendKeys("selvakumar");
		driver.findElement(By.id("lastname")).sendKeys("ananth");
		driver.findElement(By.id("company")).sendKeys("Qwaytechnologies");
		driver.findElement(By.id("address1")).sendKeys("60054");
		driver.findElement(By.id("address2")).sendKeys("west street");
		driver.findElement(By.id("city")).sendKeys("chennai");
		Select state = new Select(driver.findElement(By.id("id_state")));
		state.selectByVisibleText("Arkansas");
		driver.findElement(By.id("postcode")).sendKeys("63350");
		driver.findElement(By.id("other")).sendKeys("9999999999");
		driver.findElement(By.id("phone")).sendKeys("044-2212344");
		driver.findElement(By.id("phone_mobile")).sendKeys("8531836153");
		driver.findElement(By.id("alias")).sendKeys("add");
		driver.findElement(By.id("submitAccount")).click();

	}

}
