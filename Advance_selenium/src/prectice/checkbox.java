package prectice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class checkbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/MicroApt/OneDrive/Desktop/Selenium/prm.html");
		Thread.sleep(2000);
		List<WebElement> ele = driver.findElements(By.xpath("//input[@type='checkbox']"));
		// ((WebElement) driver.findElements(By.xpath("//input[@type='checkbox']"))).click();
		 
	 
		Thread.sleep(2000);
		
	}

}
