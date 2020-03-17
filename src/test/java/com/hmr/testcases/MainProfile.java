package com.hmr.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hmr.pages.LoginPage;
import com.hmr.pages.MainPage;

public class MainProfile extends BaseClass {

	@Test
	public void TC_03() 
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
		
		mp.clickProfile();
		logger.info("clicked profile link");
		if(driver.getTitle().equals("AplHmr"))
		{
			Assert.assertTrue(true);
			logger.info("test case3 success");
		}
		
		else
		{   logger.info("test case3 failed");
			Assert.assertTrue(false);
		
		}
}
}
