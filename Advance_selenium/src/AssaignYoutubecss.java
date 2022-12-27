import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AssaignYoutubecss{

	public static void main(String[] args) throws InterruptedException {

		 	System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		 	WebDriver driver =new FirefoxDriver();
			driver.get("https://www.youtube.com");
			
		   driver.findElement(By.cssSelector("input[id='search']")).sendKeys("kgf trailer");
		   Thread.sleep(1000);
		   driver.findElement(By.cssSelector("button[aria-label='Search']")).click();
		   Thread.sleep(1000);
		   driver.findElement(By.cssSelector("yt-formatted-string[aria-label='KGF Trailer Kannada | Yash | Srinidhi Shetty | Prashanth Neel, Vijay Kiragandur, KGF Kannada Trailer by Hombale Films 4 years ago 2 minutes, 45 seconds 23,332,374 views']")).click();
		   driver.findElement(By.cssSelector("div[class='yt-spec-touch-feedback-shape__fill']")).click();

	}
	
}
