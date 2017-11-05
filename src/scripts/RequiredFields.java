package scripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import generic.BaseTest;
import pom.RegistrationPage;
import pom.ResponsePage;

public class RequiredFields extends BaseTest {
	@Test(priority=4)
	public void TestRequiredFields() throws InterruptedException {
		RegistrationPage r5 = new RegistrationPage(driver);
		//User Name
		r5.username("Sachinvr");
		//Password
		r5.password();
		//Submit Button
		r5.SubmitButton();
		
		//First Name
		r5.FirstName("Sachin");
		//Last Name
		r5.LastName("VR");
		//Email
		r5.email("sachin@gmail.com");
		//Submit Button
		r5.SubmitButton();
		Thread.sleep(2000);
		ResponsePage rp3= new ResponsePage(driver);
		//Response message
		rp3.Response();
		//Screenshot
		TakesScreenshot t = (TakesScreenshot)driver;
		File srcFile= t.getScreenshotAs(OutputType.FILE);
		
		//copy paste the image to required location
		
		File destFile = new File("E:/RequiredFields.png");
		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

}
