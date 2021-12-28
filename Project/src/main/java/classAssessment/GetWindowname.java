package classAssessment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetWindowname {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		System.out.println(driver.window.ge);
		driver.switchTo().window()
		
		

	}

}
