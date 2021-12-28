package classAssessment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class Firefox {
WebDriver driver;
	@Test
public void fire() {

		System.setProperty("webdriver.gecko.driver", "");
		WebDriver driver=new FirefoxDriver();
	driver.get("http://localhost:8888/index.php?module=Accounts&action=index");
	}
}
