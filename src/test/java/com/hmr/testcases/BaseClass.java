package com.hmr.testcases;



import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.hmr.utilities.Readconfig;



public class BaseClass {

Readconfig readconfig= new Readconfig();
	
	
	public String baseURL=readconfig.getApplicationURL();
	public String username=readconfig.getUsername();
	public String password=readconfig.getPassword();
		public static  WebDriver driver;
		public static Logger logger;
		
		@Parameters("browser")
		@BeforeClass
		public void setup(String br)
		{
			
			logger = Logger.getLogger("hydhmr");
			PropertyConfigurator.configure("log4j.properties");
			
			if(br.equals("chrome")){
				System.setProperty("webdriver.chrome.driver",readconfig.getChromepath());
				driver=new ChromeDriver();
		}

				else if(br.equals("firefox")){
			System.setProperty("webdriver.chrome.driver",readconfig.getFirefox());
			driver=new FirefoxDriver();
		}
		}
		
		@AfterClass
		public void tearDown()
		{
			driver.quit();
		}
		
		public void captureScreen(WebDriver driver, String tname) throws IOException{
			//TakesScreenshot ts = (TakesScreenshot) driver;
			//File source = ts.getScreenshotAs(OutputType.FILE);
			//File target = new File(System.getProperty("user.dir") + "\\Screenshot\\" + tname + ".png");
			System.out.println("Screenshot taken");
			
		}
		
	}
	


