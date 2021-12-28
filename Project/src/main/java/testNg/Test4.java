package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test4 {
	@Test
	public void test4() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); 	
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.close();
		driver.quit();
	}

}
