package com.ebay.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.crest.utils.BrowserUtil;
import com.ebay.webpages.PageObjectFactory;

public class SignInTest extends BrowserUtil{

	@Test(dataProvider="loginData", dataProviderClass=TestData.class)
	public void verifyInvalidLogin(String url,String username, String password, String errorMsg) throws IOException
	{
		PageObjectFactory prof=new PageObjectFactory(driver);
		prof.homePage().loadUrl(url);
		prof.homePage().clickOnSignIn();
		prof.loginPage().loginAs(username, password);
		prof.loginPage().verifyErrorMessage(errorMsg);
		
		
		/*HomePage homepage=new HomePage(driver);
		homepage.loadUrl(url);
		homepage.clickOnSignIn();
		LoginPage loginPage=new LoginPage(driver);
		loginPage.loginAs(username, password);
		loginPage.verifyErrorMessage(errorMsg);*/
	}
		
}
