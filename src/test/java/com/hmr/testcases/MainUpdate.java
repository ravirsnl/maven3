package com.hmr.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hmr.pages.LoginPage;
import com.hmr.pages.MainPage;

public class MainUpdate extends BaseClass {

	@Test
	public void TC_04() throws IOException 
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

		mp.clickUpdate();
		logger.info("clicked update address link");
		if(driver.getTitle().equals("Update profile"))
		{
			Assert.assertTrue(true);
			logger.info("test case4 success");
		}
		
		else
		{	
			captureScreen(driver,"LoginTest");
			logger.info("test case4 failed");
			Assert.assertTrue(false);
			
		}
}
}
