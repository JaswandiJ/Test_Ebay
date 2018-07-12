package com.ebay.tests;

import org.testng.annotations.Test;

import com.crest.utils.BrowserUtil;
import com.ebay.webpages.PageObjectFactory;

public class CartCountTest extends BrowserUtil{
	
	@Test(dataProvider="cartCount",dataProviderClass=TestData.class)
	public void verifyCartCount(String url, String product)
	{

		PageObjectFactory prof=new PageObjectFactory(driver);
		prof.homePage().loadUrl(url);
		prof.homePage().searchProduct(product);
		prof.resultPage().clickOnFirstProduct();
		prof.prodDetailsPage().clickAddToCart();
		prof.cartPage().verifyCartCount();
		
		
		/*HomePage homePage=new HomePage(driver);
		homePage.loadUrl(url);
		homePage.searchProduct(product);
		ResultsPage resultsPage=new ResultsPage(driver);
		resultsPage.clickOnFirstProduct();
		ProductDetailsPage prodDetails=new ProductDetailsPage(driver);
		prodDetails.clickAddToCart();
		CartPage cartPage=new CartPage(driver);
		cartPage.verifyCartCount();*/
	}

}
