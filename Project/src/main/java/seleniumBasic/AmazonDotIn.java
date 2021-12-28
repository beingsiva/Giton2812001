package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonDotIn {

	public static void main(String[] args) {
		//a[text()='Sell on Amazon']
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		String first = driver.getTitle();
		System.out.println(first);
		driver.findElement(By.xpath("//a[text()='Sell on Amazon']")).click();
		String second = driver.getTitle();
		System.out.println(second);
		if(first.equals(second))
			System.out.println("same page");
		else
			System.out.println("different page");

	}

}
