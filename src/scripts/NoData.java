package scripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import pom.RegistrationPage;

public class NoData extends BaseTest{
	
	@Test(priority=2)
	public void emptyData() throws InterruptedException {
		RegistrationPage r3 = new RegistrationPage(driver);
		//Submit Button
		r3.SubmitButton();
		
		Reporter.log("Please enter your First Name",true);
		Reporter.log("Please enter your Last Name",true);
		Reporter.log("Please enter your Username",true);
		Reporter.log("Please enter your Password",true);
		Reporter.log("Please confirm your password",true);
		Reporter.log("Please enter your Email Address",true);
		
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,100)", "");
		//Take Screenshot
		TakesScreenshot t = (TakesScreenshot)driver;
		File srcFile= t.getScreenshotAs(OutputType.FILE);
		
		//copy paste the image to required location
		
		File destFile = new File("E:/NoData.png");
		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	

}
