package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePageClass{

	public LoginPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(id = "input-email")
	WebElement loginEmail;
	
	@FindBy(id = "input-password")
	WebElement loginPWD;
	
	@FindBy(xpath = "//input[@value = 'Login']")
	WebElement loginBTN;
	
	public void setEmail(String email)
	{
		loginEmail.sendKeys(email);
	}

	public void setPassword(String pwd)
	{
		loginPWD.sendKeys(pwd);
	}
	
	public void clickButton()
	{
		loginBTN.click();
	}
}
