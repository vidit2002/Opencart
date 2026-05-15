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
	@FindBy(xpath = "//button[@type = 'button']//span[text() = 'Add to Cart']")
	WebElement addToCartMacbook;
	
	@FindBy(xpath = "//div[@id = 'top-links']//li[5]")
	WebElement clickProceedToCheckOut;
	
	//Actions
	public void clickMacbook()
	{
		mywait.until(ExpectedConditions.visibilityOf(addToCartMacbook));
		addToCartMacbook.click();
	}
	
	public void clickProceedToCheckOut()
	{
		mywait.until(ExpectedConditions.visibilityOf(clickProceedToCheckOut));
		clickProceedToCheckOut.click();
	}
}
