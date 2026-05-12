package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckOutValidationPage extends BasePageClass{

	WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
	
	//Constructor
	public CheckOutValidationPage(WebDriver driver) {
		super(driver);
	}
	
	//Locators
	@FindBy(xpath = "//button[@onclick = \"cart.add('43');\"]")
	WebElement addToCartMacbook;
	
	@FindBy(xpath = "//button[@onclick = \"cart.add('40');\"]")
	WebElement addToCartIphone;
	
	@FindBy(xpath = "//a[@title = 'Checkout']")
	WebElement clickCheckingOut;

	//Actions
	public void clickMacbook()
	{
		mywait.until(ExpectedConditions.visibilityOf(addToCartMacbook));
		addToCartMacbook.click();
	}
	
	public void clickIphonek()
	{
		mywait.until(ExpectedConditions.visibilityOf(addToCartIphone));
		addToCartIphone.click();
	}
	
	public void clickCheckingOutBtn()
	{
		mywait.until(ExpectedConditions.visibilityOf(clickCheckingOut));
		clickCheckingOut.click();
	}
}
