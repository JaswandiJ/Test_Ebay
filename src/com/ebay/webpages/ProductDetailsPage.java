package com.ebay.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ProductDetailsPage {

	WebDriver driver;
	
	@FindBy(xpath="//a[@id='bidBtn_btn']")
	WebElement bidButton;
	@FindBy(xpath="//a[@id='isCartBtn_btn']")
	WebElement AddToCartBtn;
	
	public ProductDetailsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void verifyBid(String placeBidLabel)
	{
		Assert.assertEquals(bidButton.getText(), placeBidLabel);
	}
	
	public void clickAddToCart()
	{
		AddToCartBtn.click();
	}
}
