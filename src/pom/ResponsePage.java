package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ResponsePage {
	
	//Locator for Thanks
	@FindBy(xpath="//b[text()='Thanks']")
	private WebElement tn;
	
	public ResponsePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void Response() {
		String resText=tn.getText();
		Reporter.log("You have successfully registered : "+resText, true);
	}
}
