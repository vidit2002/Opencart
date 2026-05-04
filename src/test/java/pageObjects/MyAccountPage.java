package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePageClass{

	public MyAccountPage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(xpath = "//h2[text() = 'My Account']")
	WebElement Heading;
	
	@FindBy(xpath = "//*[@id=\"column-right\"]/div/a[13]")
	WebElement logout;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div/div/a")
	WebElement continueBTN;
	
	public boolean isMyaccountDisplayed()
	{
		try {
			return Heading.isDisplayed();
		}catch(Exception e)
		{
			return false;
		}
	}
	
	public void clickLogout()
	{
		logout.click();
	}
	
	public void clickContinue()
	{
		continueBTN.click();
	}
	
}
