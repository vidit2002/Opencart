package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass{
	
	@Test(groups = {"Sanity"})
	public void verify_login()
	{
		logger.info("***Starting TC002_Verify_Login***");
		
		try {
		HomePage hp = new HomePage(driver);
		hp.clickMyaccount();
		hp.clickLogin();
		
		LoginPage lp = new LoginPage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("pwd"));
		lp.clickButton();
		
		MyAccountPage map = new MyAccountPage(driver);
		boolean targetMAC = map.isMyaccountDisplayed();
		
		if(targetMAC)
		{
		    Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		}catch(Exception e)
		{
			Assert.fail();
		}
				
		logger.info("***Finished TC002_Verify_Login***");
	}

}
