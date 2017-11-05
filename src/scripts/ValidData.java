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

public class ValidData extends BaseTest {
	@Test(priority=7)
	public void TestValidRegistration() throws InterruptedException {
		RegistrationPage p = new RegistrationPage(driver);
			
				//We can also use DataDriven using Excel. Here I am hard coding values
				//enter valid FirstName
				p.FirstName("Sachinvr");
				
				//enter valid LastName
				p.LastName("VR");
				
				//select value from drop-down for Department/Office
				p.dropdown();
				
				//select UserName
				p.username("Sachinvr");
				
				//select Password
				p.password();
				
				//Email
				p.email("vr.sachin3@gmail.com");
			
				//Contact Number
				p.ContactNum("1234567890");
				
				//Submit button
				p.SubmitButton();
				
				//Display the list of options
				p.dropdownOptions();
				
				//Thanks
				ResponsePage r = new ResponsePage(driver);
				r.Response();
				
				//Take Screenshot
				TakesScreenshot t = (TakesScreenshot)driver;
				File srcFile= t.getScreenshotAs(OutputType.FILE);
				
				//copy paste the image to required location
				
				File destFile = new File("E:/Valid.png");
				try {
					FileUtils.copyFile(srcFile, destFile);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				Thread.sleep(2000);
				}
	}


