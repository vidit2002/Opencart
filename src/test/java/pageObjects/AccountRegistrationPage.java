package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePageClass{

	//CONSTRUCTOR
	public AccountRegistrationPage(WebDriver driver) 
	{
		super(driver);
	}

	//LOCATORS
	@FindBy(xpath = "//input[@id= 'input-firstname']")
	WebElement firstname;
	
	@FindBy(xpath = "//input[@id= 'input-lastname']")
	WebElement lastname;
	
	@FindBy(xpath = "//input[@id= 'input-email']")
	WebElement email;
	
	@FindBy(xpath = "//input[@id= 'input-telephone']")
	WebElement telephone;
	
	@FindBy(xpath = "//input[@id= 'input-password']")
	WebElement pwd;
	
	@FindBy(xpath = "//input[@id= 'input-confirm']")
	WebElement confirmpwd;
	
	@FindBy(xpath = "//input[@type= 'checkbox' and @name = 'agree']")
	WebElement checkbox;
	
	@FindBy(xpath = "//input[@value= 'Continue']")
	WebElement button;
	
	@FindBy(xpath = "//h1[text() = 'Your Account Has Been Created!']")
	WebElement message;
	/*@FindBy(xpath = "//div[@class = 'alert alert-danger alert-dismissible']")
	WebElement message;
	message
	*/
	//<div class="alert alert-danger alert-dismissible"><i class="fa fa-exclamation-circle"></i>Warning: You must agree to the Privacy Policy!</div>
	
	//ACTIONS
	public void setFirstname(String frstname)
	{
		firstname.sendKeys(frstname);
	}
	
	public void setLastname(String lstname)
	{
		lastname.sendKeys(lstname);
	}
	
	public void setEmail(String Email)
	{
		email.sendKeys(Email);
	}
	
	public void setTelephone(String Telephone)
	{
		telephone.sendKeys(Telephone);
	}
	
	public void setPassword(String Password)
	{
		pwd.sendKeys(Password);
	}
	
	public void setConfirmPassword(String Password)
	{
		confirmpwd.sendKeys(Password);
	}
	
	public void clickCheckBox()
	{
		checkbox.click();
	}
	
	public void clickButton()
	{
		button.click();
	}
	
	public String getMessage()
	{
		try {
			return message.getText();
		}
		catch(Exception e) {
			 return e.getMessage();
		}
	}
}
