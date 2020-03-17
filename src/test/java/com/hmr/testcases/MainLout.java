package com.hmr.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hmr.pages.LoginPage;
import com.hmr.pages.MainPage;

public class MainLout extends BaseClass {

	@Test
	public void TC_05() 
	{
		driver.get(baseURL);
		
		
logger.info("URL is opened");
		
		LoginPage lp=new LoginPage(driver);
		MainPage mp=new MainPage(driver);
		
		lp.setUserName(username);
		logger.info("entered username");
		lp.setPassword(password);
		logger.info("entered paswprd");
		lp.clickSubmit();
		
		logger.info("login sussecc");
		mp.clickLogout();
		logger.info("logout sussecc");
		if(driver.getTitle().equals("HMR"))
		{
			Assert.assertTrue(true);
			logger.info("test case5 success");
		}
		
		else
		{
			Assert.assertTrue(false);
			logger.info("test case5 failed");
		}
}
}
