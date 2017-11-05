package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import pom.RegistrationPage;
import pom.ResponsePage;

public class UniquenessCheck extends BaseTest{
	@Test(priority=5, invocationCount=2)

	public void TestUniqueness() throws InterruptedException {
		
		RegistrationPage r6 = new RegistrationPage(driver);
		
		//We can also use DataDriven using Excel. Here I am hard coding values
		//enter valid FirstName
		r6.FirstName("Sachinvr");
		
		//enter valid LastName
		r6.LastName("VR");
		
		//select value from drop-down for Department/Office
		r6.dropdown();
		
		//select UserName
		r6.username("Sachinvr");
		
		//select Password
		r6.password();
		
		//Email
		r6.email("abc@abc.com");
	
		//Contact Number
		r6.ContactNum("1234567890");
		
		//Submit button
		r6.SubmitButton();
		
		//Thanks
		ResponsePage r = new ResponsePage(driver);
		r.Response();
		}

	}
	

