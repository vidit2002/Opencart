package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC003_LoginDDT extends BaseClass {

	@Test(dataProvider="loginData", dataProviderClass = DataProviders.class, groups = "DataDriven" )
	public void verify_LoginDDT(String email, String pwd, String exp)
	{
		logger.info("***Starting TC003_LoginData***");
		
		try {
		HomePage hp = new HomePage(driver);
		hp.clickMyaccount();
		hp.clickLogin();
		
		LoginPage lp = new LoginPage(driver);
		lp.setEmail(email);
		lp.setPassword(pwd);
		lp.clickButton();
		
		MyAccountPage map = new MyAccountPage(driver);
		boolean targetMAC = map.isMyaccountDisplayed();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)");
		
		/*
		 DATA IS  VALID - LOGIN SUCCESS - TEST PASS - LOGOUT
		 DATA IS VALID - LOGIN FAILED - TEST FAIL
		 
		 DATA IS INVALID - LOGIN SUCCESS - TEST FAILED - LOGOUT
		 DATA IS INVALID - LOGIN FAILED - TEST PASS
		 */
		
		if(exp.equalsIgnoreCase("Valid"))
		{
		  if(targetMAC == true)
		  {
			  map.clickLogout();
			  map.clickContinue();
			  Assert.assertTrue(true);
		  }
		  else
		  {
			  Assert.assertTrue(false);
		  }
		}
		else if(exp.equalsIgnoreCase("Invalid"))
		{
		  if(targetMAC == true)
		   {
			  map.clickLogout();
			  map.clickContinue();
			  Assert.assertTrue(false);
		   }
		   else
		   {
			   Assert.assertTrue(true);
		   }
		}
		}catch(Exception e)
		{
			Assert.fail();
		}
		
		logger.info("***Finished TC003_LoginData***");
      }
}
