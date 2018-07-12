package com.ebay.tests;



import org.testng.annotations.Test;

import com.crest.utils.BrowserUtil;
import com.ebay.webpages.PageObjectFactory;

public class SearchProductTest extends BrowserUtil{

	@Test(dataProvider="productSearch", dataProviderClass=TestData.class)
	public void searchProduct(String url, String product) {
		
		PageObjectFactory prof=new PageObjectFactory(driver);
		prof.homePage().loadUrl(url);
		prof.homePage().searchProduct(product);
		prof.resultPage().clickOnAuction();
		prof.resultPage().verifyFirstProduct();
		
		/*HomePage homePage = new HomePage(driver);
		homePage.loadUrl(url);
		homePage.searchProduct(value);
		ResultsPage resultsPage = new ResultsPage(driver);
		resultsPage.clickOnAuction();
		resultsPage.verifyFirstProduct();*/
	}

}
