package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CheckOutValidationPage;
import testBase.BaseClass;

public class TC004_Checkout_Validation extends BaseClass {
	
	@Test(groups = {"Sanity","Master"})
	void verify_CheckOut()
	{
		logger.info("Starting TC004_Checkout_Validation");
		
		try {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		
		CheckOutValidationPage covp = new CheckOutValidationPage(driver);
		
		logger.info("Adding Macbook in Cart");
		covp.clickMacbook();
		
		js.executeScript("window.scrollBy(0,300)");
		
		logger.info("Adding Iphone in Cart");
		covp.clickIphonek();
		
		logger.info("Clicking CheckOut Button");
		covp.clickCheckingOutBtn();
		
		new BaseClass().captureScreenshot("TC004_Checkout_Validation");
		
		/*ShoppingCartPage scp = new ShoppingCartPage(driver);
		
		if(scp.getErrorMsg().equals("Products marked with *** are not available in the desired quantity or not in stock"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertFalse(false);
		}*/
		
		}catch(Exception e)
		{
			Assert.fail();
		}
		
		logger.info("Finished TC004_Checkout_Validation");
	}
	
}
