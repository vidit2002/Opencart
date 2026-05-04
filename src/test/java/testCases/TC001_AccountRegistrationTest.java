 package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;


public class TC001_AccountRegistrationTest extends BaseClass {

	@Test(groups = {"Regression", "Master"})
	void verify_account_registration()
	{
		try {
		logger.info("*** Starting TC001_AccountRegistrationTest ***");
		HomePage hp = new HomePage(driver);
		
		logger.info("Clicking My Account");
		hp.clickMyaccount();
		logger.info("Clicking Register");
		hp.clickRegister();
		
		AccountRegistrationPage arp = new AccountRegistrationPage(driver);
		
		logger.info("Providing Customer Details");
		arp.setFirstname(RandomString());
		arp.setLastname(RandomString());
		arp.setEmail(RandomString()+"@gmail.com");
		arp.setTelephone(RandomNumber());
		String pwd = RandomAlphaNumeric();
		arp.setPassword(pwd);
		arp.setConfirmPassword(pwd);
		
		logger.info("Clicking CheckBox and Button");
		arp.clickCheckBox();
		arp.clickButton();
		
		if(arp.getMessage().equals("Your Account Has Been Created!"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			logger.error("Test Failed");
			logger.debug("Debug Logs");
			Assert.assertTrue(false);
		}
		
		//Assert.assertEquals(arp.getMessage(), "Your Account Has Been Created!!!");
		}catch(Exception e)
		{
			Assert.fail();
		}
		
		logger.info("*** Finished TC001_AccountRegistrationTest ***");
		
	}
	
}
