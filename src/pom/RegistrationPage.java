package pom;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;


public class RegistrationPage {

	public String pwd = "Welcome001";
	public String pwdMisMatch = "Welcome002";
	public String Invalidpwd="W";
	public String Emptypwd="";
	public String mismatchPwd="Welcome9999999999999";
	public WebDriver driver;
	
	// locators for FirstName
	@FindBy(xpath="//label[text()='First Name']")
	private WebElement fnText;
	
	@FindBy(name="first_name")
	private WebElement fnData;
	
	//locators for LastName
	@FindBy(xpath="//label[text()='Last Name']")
	private WebElement lnText;
	
	@FindBy(name="last_name")
	private WebElement lnData;
	
	//Locators for Department/Office drop-down
	@FindBy(xpath="//label[text()='Department / Office']")
	private WebElement DeptText;
	
	@FindBy(name="department")
	private WebElement DeptName;
	
	//Locators for UserName
	@FindBy(xpath="//*[@id='contact_form']//div[4]/label")
	private WebElement UnText;
	
	@FindBy(name="user_name")
	private WebElement unValue;
	
	//Locators for Password
	@FindBy(xpath="//*[@id='contact_form']//div[5]/label")
	private WebElement pwdText;
	
	@FindBy(name="user_password")
	private WebElement pwdValue;
	
	//Locators for Confirm Password
	@FindBy(xpath="//label[text()='Confirm Password']")
	private WebElement CnfpwdText;
	
	@FindBy(name="confirm_password")
	private WebElement CnfpwdValue;
	
	//Locators for Email
	@FindBy(xpath="//label[text()='E-Mail']")
	private WebElement EmailText;
	
	@FindBy(name="email")
	private WebElement emailValue;
	
	//Locator for contact number
	@FindBy(xpath="//label[text()='Contact No.']")
	private WebElement ContNumText;
	
	@FindBy(name="contact_no")
	private WebElement ContNumValue;
	
	//Locator for Submit button
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submitBtn;
	
	//Locators for ValidationMessage
	@FindBy(xpath="//small[text()='Please enter your First Name']")
	private WebElement plzFirstName;
	@FindBy(xpath="//small[text()='Please enter your Last Name']")
	private WebElement plzLastName;
	@FindBy(xpath="//small[text()='Please enter your Username']")
	private WebElement plzUN;
	@FindBy(xpath="//small[text()='Please enter your Password']")
	private WebElement plzPwd;
	@FindBy(xpath="Please confirm your Password")
	private WebElement plzConfPwd;
	@FindBy(xpath="//small[text()='Please enter your Email Address']")
	private WebElement plzEmail;
	
	
	public RegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void FirstName(String F) {
		Reporter.log("The name of the fields are shown below",true);
	String FNameTxt=fnText.getText();
		 fnData.sendKeys(F);
		Reporter.log(FNameTxt,true);
	}

	public void LastName(String L) {
		String LNameTxt = lnText.getText();
		lnData.sendKeys(L);
		Reporter.log(LNameTxt,true);
	}

	public void dropdown() {
	String drpDwn = DeptText.getText();
	Reporter.log(drpDwn,true);
	Select s11 = new Select(DeptName);
	s11.selectByVisibleText("Engineering");
	}
	
	public void dropdownOptions() {
		Select s12 = new Select(DeptName);
		List<WebElement> allOptions=s12.getOptions();
		int count=allOptions.size();
		Reporter.log("List of oprions of Department/Office are shown below",true);
			for(int i=0;i<count;i++) {
				WebElement option=allOptions.get(i);
				String text= option.getText();
				Reporter.log(text,true);
			
			}
	}
	
	public void username(String un) {
		String uT = UnText.getText();
		Reporter.log(uT,true);
		unValue.sendKeys(un);
	}

	public void password() {
		String PwdT = pwdText.getText();
		Reporter.log(PwdT,true);
		pwdValue.sendKeys(pwd);
		CnfpwdValue.sendKeys(pwd);
	}
	
	public void invalidPassword() {
		pwdValue.sendKeys(Invalidpwd);
		CnfpwdValue.sendKeys(Invalidpwd);
	}
	
	public void ConfmismatchPassword() {
		String CnfrmT= CnfpwdText.getText();
		Reporter.log(CnfrmT,true);
		CnfpwdValue.sendKeys(mismatchPwd);		
	}
	
	public void EmptyPassword() {
		pwdValue.sendKeys(Emptypwd);
		CnfpwdValue.sendKeys(Emptypwd);
	}
	
	public void email(String eM) {
		String mail = EmailText.getText();
		Reporter.log(mail, true);
		emailValue.sendKeys(eM);
	}

	public void ContactNum(String Cont) {
		String ContN=ContNumText.getText();
		Reporter.log(ContN,true);
		ContNumValue.sendKeys(Cont);
	}

	public void SubmitButton() {
		String sbtBtn=submitBtn.getText();
		Reporter.log(sbtBtn, true);
		submitBtn.click();
		}

	public void misMatPwd() {
			pwdValue.sendKeys(pwdMisMatch);	
			String PwdT = pwdText.getText();
			Reporter.log(PwdT,true);
		}
	 }
	

	


