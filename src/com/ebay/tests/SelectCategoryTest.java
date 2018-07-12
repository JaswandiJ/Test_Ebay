package com.ebay.tests;

import org.testng.annotations.Test;

import com.crest.utils.BrowserUtil;
import com.ebay.webpages.PageObjectFactory;

public class SelectCategoryTest extends BrowserUtil{

	@Test(dataProvider="selectCategory",dataProviderClass=TestData.class)
	public void VerifyBooksMagazines(String url,String category){
		
		PageObjectFactory prof=new PageObjectFactory(driver);
		prof.homePage().loadUrl(url);
		prof.homePage().selectCategory(category);
		prof.resultPage().verifyFirstProduct();
		
		
		/*HomePage homePage = new HomePage(driver);
		homePage.loadUrl(url);
		homePage.selectCategory(category);
		ResultsPage resultsPage=new ResultsPage(driver);
		resultsPage.verifyFirstProduct();*/
			
	}
}
