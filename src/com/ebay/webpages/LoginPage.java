package com.ebay.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.crest.utils.BrowserUtil;

public class LoginPage extends BrowserUtil{

	WebDriver driver;
	@FindBy(xpath="//input[@placeholder='Email or username'][@class='fld']")
	WebElement userNametxtBox;
	@FindBy(xpath="//input[@placeholder='Password'][@class='fld']")
	WebElement pswordtxtBox;
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginButton;
	@FindBy(xpath="//span[@class='sd-err']")
	WebElement errorMessage;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void loginAs(String username, String password)
	{
		userNametxtBox.sendKeys(username);
		pswordtxtBox.sendKeys(password);
		loginButton.click();
	}
	public void verifyErrorMessage(String errorMsg)
	{
		String error=errorMessage.getText();
		Assert.assertEquals(error, errorMsg,"*Verify Message*");		
	}
}
