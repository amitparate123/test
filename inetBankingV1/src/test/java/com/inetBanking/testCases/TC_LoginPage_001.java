package com.inetBanking.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.inetBanking.pageObjects.LoginPage;

public class TC_LoginPage_001 extends BaseClass {

	@Test
	public void loginTest() {
		driver.get(baseURL);

		logger.info("URL is open");
		
		LoginPage lp = new LoginPage(driver);
		lp.setUsername(Username);
		logger.info("Entered username");
		
		lp.setPassword(Password);
		logger.info("Entered password");
		
		lp.clickSubmit();

		if (driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
			logger.info("Login test passed");
			
		} else {
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
	}
}
