package com.ebay.tests;

import org.testng.annotations.Test;

import com.crest.utils.BrowserUtil;
import com.ebay.webpages.PageObjectFactory;


public class PlaceBidTest extends BrowserUtil {

	@Test(dataProvider="placeBid",dataProviderClass=TestData.class)
	public void verifyBidButton(String url, String product,String placeBidLabel) {
		
		PageObjectFactory prof=new PageObjectFactory(driver);
		prof.homePage().loadUrl(url);
		prof.homePage().searchProduct(product);
		prof.resultPage().clickOnAuction();
		prof.resultPage().clickOnFirstProduct();
		prof.prodDetailsPage().verifyBid(placeBidLabel);
				
		/*
		HomePage homePage = new HomePage(driver);
		homePage.loadUrl(url);
		homePage.searchProduct(product);
		ResultsPage resultsPage = new ResultsPage(driver);
		resultsPage.clickOnAuction();
		resultsPage.clickOnFirstProduct();
		ProductDetailsPage prodDetails = new ProductDetailsPage(driver);
		prodDetails.verifyBid(placeBidLabel);
		 */
	}
}
