package com.ebay.webpages;

import org.openqa.selenium.WebDriver;

public class PageObjectFactory {

	private WebDriver driver;
	
	HomePage homePage;
	ResultsPage resultPage;
	LoginPage loginPage;
	ProductDetailsPage prodDetailsPage;
	CartPage cartPage;
	
	public PageObjectFactory(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public HomePage homePage()
	{
		if(homePage==null)
		homePage=new HomePage(driver);
		return homePage;
	}
	
	public ResultsPage resultPage()
	{
		if(resultPage==null)
			resultPage=new ResultsPage(driver);
		return resultPage;
	}
	
	public CartPage cartPage()
	{
		if(cartPage==null)
			cartPage=new CartPage(driver);
		return cartPage;
	}
	
	public LoginPage loginPage()
	{
		if(loginPage==null)
			loginPage=new LoginPage(driver);
		return loginPage;
	}
	
	public ProductDetailsPage prodDetailsPage()
	{
		if(prodDetailsPage==null)
			prodDetailsPage=new ProductDetailsPage(driver);
		return prodDetailsPage;
	}
}
