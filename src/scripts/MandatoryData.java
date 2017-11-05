package scripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Reporter;
import org.testng.annotations.Test;
import generic.BaseTest;
import pom.RegistrationPage;


public class MandatoryData extends BaseTest {
	@Test(priority=3)
	public void TestMandatoryFields() throws InterruptedException {
		RegistrationPage r4 = new RegistrationPage(driver);
		//User Name
		r4.username("Sachinvr");
		//Password
		r4.password();
		//Submit Button
		r4.SubmitButton();
		
		TakesScreenshot t = (TakesScreenshot)driver;
		File srcFile= t.getScreenshotAs(OutputType.FILE);
		
		//copy paste the image to required location
		
		File destFile = new File("E:/MandatoryData.png");
		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread.sleep(2000);
		Reporter.log("Other fields are mandatory. please enter the data",true);
	
	}
	

}
