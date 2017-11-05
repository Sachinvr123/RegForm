package scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import pom.RegistrationPage;
import pom.ResponsePage;

public class PwdMismatch extends BaseTest {
	@Test(priority=6)
	public void TestPwdMismatch() {
		RegistrationPage r7 = new RegistrationPage(driver);

		//enter valid FirstName
		r7.FirstName("Sachinvr");
		
		//enter valid LastName
		r7.LastName("VR");
		
		//select value from drop-down for Department/Office
		r7.dropdown();
		
		//select UserName
		r7.username("Sachinvr");
		
		//select Password
		r7.misMatPwd();
		
		//ConfPwd
		r7.ConfmismatchPassword();
		Reporter.log("Password and Confirm Password doesnot match",true);
		
		//Email
		r7.email("abc@abc.com");
	
		//Contact Number
		r7.ContactNum("1234567890");
		
		//Submit button
		r7.SubmitButton();
		
		//Thanks
		ResponsePage r = new ResponsePage(driver);
		//Response Message
		r.Response();
		
	}

}
