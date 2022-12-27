package findelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Aassaignmentinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
	 	WebDriver driver =new FirefoxDriver();
	 	driver.get("https://www.amazon.com");
	 	//driver.findElements(By.xpath(xpathExpression))

	}

}
