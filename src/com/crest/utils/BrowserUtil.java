package com.crest.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BrowserUtil {
	public WebDriver driver;

	@Parameters("browserName")
	@BeforeTest
	public void openBrowser(String browserName) {
		if(browserName.toLowerCase().startsWith("f"))
		{
			driver=new FirefoxDriver();
		}
		else if(browserName.toLowerCase().startsWith("c"))
		{
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.toLowerCase().startsWith("i"))
		{
			System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	/*@AfterTest
	public void closeBrowser() {
		driver.close();
	}*/
}
