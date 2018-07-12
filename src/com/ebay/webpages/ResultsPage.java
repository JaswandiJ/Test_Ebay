package com.ebay.webpages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ResultsPage {

	WebDriver driver;
	@FindBy(xpath="//input[@value='LH_Auction']")
	WebElement auctionRadButton;
	@FindBy(xpath="//li//h3/a")
	WebElement firstProduct;
	@FindBy(xpath="//a[@aria-controls='SortMenu']")
	WebElement bestMatch;
	@FindBy(xpath="//a[text()='Price: highest first']")
	WebElement highestPriceFirst;
	
	public ResultsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnAuction() {
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		auctionRadButton.click();
	}

	public void clickOnFirstProduct() {
		firstProduct.click();
	}
	
	public void verifyFirstProduct()
	{
		Assert.assertTrue (firstProduct.isDisplayed());
	}
	
	public void verifyBestMatch(String expString)
	{
		Assert.assertEquals(bestMatch.getText(),expString);
	}
	public void selectHighestPriceFirst()
	{		
		Actions action=new Actions(driver);
		action.moveToElement(bestMatch).perform();
		action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		
		
		/*highestPriceFirst.click();*/
	}
}
