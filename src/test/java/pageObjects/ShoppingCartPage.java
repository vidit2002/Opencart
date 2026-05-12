package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePageClass{

	//Constructors
	public ShoppingCartPage(WebDriver driver) {
		super(driver);
	}

	//Locators
	@FindBy(xpath = "//div[contains(@class, \"alert-danger alert-dismissible\")]")
	WebElement errorMsg;
	
	//Actions
	public String getErrorMsg()
	{
		return errorMsg.getText();
	}
}
