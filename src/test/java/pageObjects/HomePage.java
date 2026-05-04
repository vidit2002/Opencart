package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePageClass{

	//CONSTRUCTOR
	public HomePage(WebDriver driver)
	{
		super(driver);
	}

	//LOCATORS
	@FindBy(xpath = "//a[@title = 'My Account']")
	WebElement lnkMyaccount;
	
	@FindBy(xpath = "//a[text()= 'Register']")
	WebElement lnkRegister;
	
	@FindBy(xpath = "//a[text() = 'Login']")
	WebElement lnkLogin;
	
	//ACTIONS
	public void clickMyaccount()
	{
		lnkMyaccount.click();
	}
	
	public void clickRegister()
	{
		lnkRegister.click();
	}
	
	public void clickLogin()
	{
		lnkLogin.click();
	}
	
}
