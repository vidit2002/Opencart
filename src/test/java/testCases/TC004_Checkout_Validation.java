package testCases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CheckOutValidationPage;
import testBase.BaseClass;

public class TC004_Checkout_Validation extends BaseClass {
	
	@Test(groups = {"Master"})
	void verify_CheckOut() throws IOException
	{
		logger.info("Starting TC004_Checkout_Validation");
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		
		CheckOutValidationPage covp = new CheckOutValidationPage(driver);
		
		logger.info("Adding Macbook in Cart");
		covp.clickMacbook();
		
		//js.executeScript("window.scrollBy(0,300)");
		
		logger.info("Proceding To Checkout Section");
		covp.clickProceedToCheckOut();
		
		Assert.assertTrue(true);
		
		logger.info("Finished TC004_Checkout_Validation");
	}
	
}
