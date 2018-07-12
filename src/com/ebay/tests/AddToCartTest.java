package com.ebay.tests;

import org.testng.annotations.Test;

import com.crest.utils.BrowserUtil;
import com.ebay.webpages.PageObjectFactory;

public class AddToCartTest extends BrowserUtil{
	
	@Test(dataProvider="addCart",dataProviderClass=TestData.class)
	public void VerifyAddingToCart(String url, String product)
	{
		PageObjectFactory prof=new PageObjectFactory(driver);
		prof.homePage().loadUrl(url);
		prof.homePage().searchProduct(product);
		prof.resultPage().clickOnFirstProduct();
		prof.prodDetailsPage().clickAddToCart();
		prof.cartPage().verifyProductInCart(product);
		
				
		/*HomePage homePage=new HomePage(driver);
		homePage.loadUrl(url);
		homePage.searchProduct(product);
		ResultsPage resultsPage=new ResultsPage(driver);
		resultsPage.clickOnFirstProduct();
		ProductDetailsPage prodDetails=new ProductDetailsPage(driver);
		prodDetails.clickAddToCart();
		CartPage cartPage=new CartPage(driver);
		cartPage.verifyProductInCart(product);*/
	}

}
