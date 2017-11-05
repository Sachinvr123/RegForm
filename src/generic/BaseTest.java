package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements AutoConst {
	public WebDriver driver;
	
	static {
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		System.setProperty(GECKO_KEY, GECKO_VALUE);
	}
		@BeforeMethod
		public void OpenApplication() {
			//Firefox driver.   Use 'ChromeDriver' for Chrome browser
			driver= new FirefoxDriver();
			//driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://adjiva.com/qa-test/");	
		}

		@AfterMethod
		public void closeApplication() {
			//To close the browser
			driver.close();
			}
}
