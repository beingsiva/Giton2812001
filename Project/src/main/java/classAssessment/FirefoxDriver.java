package classAssessment;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class FirefoxDriver {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver w = new org.openqa.selenium.firefox.FirefoxDriver();
		w.get("http://localhost:8888/index.php?module=Accounts&action=index");
		

	}

}
