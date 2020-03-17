package com.hmr.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hmr.pages.LoginPage;

public class LoginTest extends BaseClass{
	@Test
	public void TC_01() throws IOException 
	{
		driver.get(baseURL);
		
		logger.info("URL is opened");
		
		LoginPage lp=new LoginPage(driver);
		
		
		lp.setUserName(username);
		logger.info("entered username");
		lp.setPassword(password);
		logger.info("entered paswprd");
		lp.clickSubmit();
		
		logger.info("login sussecc");
		if(driver.getTitle().equals("MainHMR"))
		{
			Assert.assertTrue(true);
		
			logger.info("test case1 success");
		}
		
		else
		{
			captureScreen(driver,"LoginTest");
			Assert.assertTrue(false);
			
			logger.info("test case1 failed");
		}
	
	}
		
	
}
