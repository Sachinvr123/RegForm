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

public class InvalidData extends BaseTest {
	@Test(priority=1)
	public void TestInvalidData() throws InterruptedException {
		
		RegistrationPage r2 = new RegistrationPage(driver);
		//We can also use DataDriven using Excel. Here I am hard coding values
		//First name
		r2.FirstName("S");
		Reporter.log("First Name is not valid",true);
		//Last Name
		r2.LastName("V");
		Reporter.log("Last Name is not valid",true);
		//Department/Office
		r2.dropdown();
		Reporter.log("Select your Department/Office",true);
		//user name
		r2.username("s");
		Reporter.log("User Name is not valid",true);
		//Password
		r2.invalidPassword();
		Reporter.log("Password is not valid",true);
		//Email
		r2.email("a");
		Reporter.log("Email is not valid",true);
		//Contact Number
		r2.ContactNum("12");
		Reporter.log("Contact Number is not valid",true);
		
		//Take Screenshot
		TakesScreenshot t = (TakesScreenshot)driver;
		File srcFile= t.getScreenshotAs(OutputType.FILE);
		
		//copy paste the image to required location
		
		File destFile = new File("E:/invalidData.png");
		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread.sleep(2000);
	}
}
