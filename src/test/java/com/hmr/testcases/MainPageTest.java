package com.hmr.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hmr.pages.LoginPage;
import com.hmr.pages.MainPage;

public class MainPageTest extends BaseClass {
	
	@Test
	public void TC_02() 
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
		
		mp.clickSations();
		logger.info("clicked stations link");
			
		if(driver.getTitle().equals("stations"))
		{
			Assert.assertTrue(true);
			logger.info("test case2 success");
		}
		
		else
		{
			Assert.assertTrue(false);
			logger.info("test case2 failed");
		}
	}
	
	
		
		

}
