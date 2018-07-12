package com.ebay.tests;

import org.testng.annotations.DataProvider;

public class TestData {

	@DataProvider(name="loginData")
	public static Object[][] getData()
	{
		Object[][] data=new Object[2][4];
		data[0][0]="http://ebay.in";
		data[0][1]="username1";
		data[0][2]="password";
		data[0][3]="Oops, that's not a matchbb.";
		
		/*data[1][0]="http://ebay.in";
		data[1][1]="username2";
		data[1][2]="password";
		data[1][3]="Oops, that's not a matchbb.";
		*/
		return data;
	}
	
	@DataProvider(name="productSearch")
	public static Object[][] getData1()
	{
		Object[][] data=new Object[1][2];
		data[0][0]="http://ebay.in";
		data[0][1]="pen";
				
		return data;
	}
	@DataProvider(name="selectCategory")
	public static Object[][] getData2()
	{
		Object[][] data=new Object[1][2];
		data[0][0]="http://ebay.in";
		data[0][1]="Books & Magazines";
				
		return data;
	}
	@DataProvider(name="placeBid")
	public static Object[][] getData3()
	{
		Object[][] data=new Object[1][3];
		data[0][0]="http://ebay.in";
		data[0][1]="pen";
		data[0][2]="Place bid";
						
		return data;
	}
	@DataProvider(name="addCart")
	public static Object[][] getData4()
	{
		Object[][] data=new Object[1][2];
		data[0][0]="http://ebay.in";
		data[0][1]="pen";
						
		return data;
	}
	@DataProvider(name="cartCount")
	public static Object[][] getData5()
	{
		Object[][] data=new Object[1][2];
		data[0][0]="http://ebay.in";
		data[0][1]="pen";
						
		return data;
	}
	
	@DataProvider(name="removeFromCart")
	public static Object[][] getData6()
	{
		Object[][] data=new Object[1][2];
		data[0][0]="http://ebay.in";
		data[0][1]="pen";
						
		return data;
	}
	@DataProvider(name="highestPriceFirst")
	public static Object[][] getData7()
	{
		Object[][] data=new Object[1][3];
		data[0][0]="http://ebay.in";
		data[0][1]="pen";
		data[0][2]="Best Match";
						
		return data;
	}
}
