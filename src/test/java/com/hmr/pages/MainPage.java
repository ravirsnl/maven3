package com.hmr.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
	
WebDriver ldriver;
	
	public MainPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	
	@FindBy(xpath="//b[contains(text(),'Station Halts to monitor')]")
	@CacheLookup
	WebElement btnstions;
	
	@FindBy(xpath="//b[contains(text(),'Update Profile&Skills')]")
	@CacheLookup
	WebElement btnProfile;
	
	@FindBy(xpath="//b[contains(text(),'Update Address')]")
	@CacheLookup
	WebElement btnUpdateAdess;
	
	@FindBy(xpath="//font[contains(text(),'Logout')]")
	@CacheLookup
	WebElement btnLogout;
	
	public void clickSations()
	{
		btnstions.click();
	
}
	public void clickProfile()
	{
		btnProfile.click();
	
}
	public void clickUpdate()
	{
		btnUpdateAdess.click();
	
}
	public void clickLogout()
	{
		btnLogout.click();
	
}
	
	
}
