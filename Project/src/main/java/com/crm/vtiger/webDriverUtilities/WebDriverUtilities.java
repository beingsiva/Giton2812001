package com.crm.vtiger.webDriverUtilities;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;


public class WebDriverUtilities {
	public WebDriver driver;
	public void waitUntilPageLoads() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}


	public void waitUntilvisible(WebElement element){
		WebDriverWait ref = new WebDriverWait(driver, 20);
		ref.until(ExpectedConditions.invisibilityOfAllElements(element));
		
	}
	
	public void waitAndClick(WebElement element) {
		 WebDriverWait wait = new WebDriverWait(driver, 200);
		 wait.until(ExpectedConditions.elementToBeClickable(element));
		}
	
	public void selectDropDown(WebElement element, String droptext) {
		Select drop=new Select(element);
		drop.selectByVisibleText(droptext);
		
	}
/**
 * This is methods used for select dropdown by index
 * @param element
 * @param indexvalue
 */
	public void selectDropDown(WebElement element, int indexvalue) {
		Select index= new Select(element);
		index.selectByIndex(indexvalue);
	}
	/**
	 * This method used to select dropdown by value
	 * @param element
	 * @param valuetext
	 */
	public void selectDropDown(String valuetext, WebElement element){
		Select value= new Select(element);
		value.selectByValue(valuetext);
	}
	/**
	 * This method used to mousehover on the element by using actions class
	 * @param driver
	 * @param element
	 */
	public void mouseHover(WebElement element) {
		Actions act=new Actions(driver);
		act.moveToElement(element).build().perform();
	}
	
	/**
	 * This method used to double click on the element by using actions class
	 * @param driver
	 * @param element
	 */
	public void doubleClick(WebElement element) {
		Actions act=new Actions(driver);
		act.doubleClick(element).build().perform();
	}
	/**
	 * This method used to rightclikc
	 * @param driver
	 * @param element
	 */
	
	public void rightClick(WebElement element) {
		Actions act=new Actions(driver);
		act.contextClick(element).build().perform();
		
	}
	public void switchToWindow(int index) {
		ArrayList<String> win = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(win.get(index));
		//String parent = driver.getWindowHandle();
		//Set<String> child = driver.getWindowHandles();
		//for(String win:child) {
			//driver.switchTo().window(win);
		//}
		}
	
	public void alertAccept () {
		Alert popup = driver.switchTo().alert();
		popup.accept();
		}
	
	public void alertDismiss() {
		Alert popup = driver.switchTo().alert();
		popup.dismiss();
		}
	
	public void fileDownload(WebElement ele) {
		ele.click();
		
	}
	public void switchFrame(int value) {
		driver.switchTo().frame(value);
	}
	
	public void switchFrame(String name) {
		driver.switchTo().frame(name);
		
	}
	
	public void screenShot(String screenshotName) throws IOException {
	//		File scrfile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//		FileUtils.copyDirectory(scrfile, new File("screenshot"+System.currentTimeMillis()+".png"));
	TakesScreenshot ss= (TakesScreenshot) driver;
	File source = ss.getScreenshotAs(OutputType.FILE);
	File destination= new File("./Screenshots/"+screenshotName+".PNG");
	Files.copy(source, destination);
		}
	
	 public void takeScreenshot(WebDriver driver, String screenshotName) throws Throwable {
	    	TakesScreenshot ts=(TakesScreenshot)driver;
	    	File src=ts.getScreenshotAs(OutputType.FILE);
	    	File dest=new File("./Screenshots/"+screenshotName+".PNG");
	    	Files.copy(src, dest);
	    }
	public void scrollToWebElement() {
		
	}
	
	public String getSystemDate() {
		Date date1= new Date();
		String date = date1.toString();
		return date;
	}
}

