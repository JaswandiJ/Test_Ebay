package com.ebay.tests;

import org.testng.annotations.Test;

import com.crest.utils.BrowserUtil;
import com.ebay.webpages.PageObjectFactory;

public class RemoveFromCartTest extends BrowserUtil{

	@Test(dataProvider="removeFromCart",dataProviderClass=TestData.class)
	void verifyRemovingFromCart(String url,String product)
	{
		PageObjectFactory prof=new PageObjectFactory(driver);
		prof.homePage().loadUrl(url);
		prof.homePage().searchProduct(product);
		prof.resultPage().clickOnFirstProduct();
		prof.prodDetailsPage().clickAddToCart();
		prof.cartPage().removeFromCart();
		
		
		/*HomePage homePage=new HomePage(driver);
		homePage.loadUrl(url);
		homePage.searchProduct(product);
		ResultsPage resultsPage=new ResultsPage(driver);
		resultsPage.clickOnFirstProduct();
		ProductDetailsPage prodDetails=new ProductDetailsPage(driver);
		prodDetails.clickAddToCart();
		CartPage cartPage=new CartPage(driver);
		cartPage.removeFromCart();*/
	}

}
